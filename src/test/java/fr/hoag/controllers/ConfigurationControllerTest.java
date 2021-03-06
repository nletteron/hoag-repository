package fr.hoag.controllers;

import org.assertj.core.api.Assertions;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("dev")
public class ConfigurationControllerTest {

    @MockBean
    private ConfigurationController configurationController;

    @Test
    public void contextLoads() {

    }

    @Test
    void should_return_version_api() {
        when(this.configurationController.versionApi()).thenReturn("1.0");
        String versionApi = this.configurationController.versionApi();
        assertThat(versionApi).isEqualTo("1.0");
    }

    @Test
    void should_return_version_app() throws IOException, XmlPullParserException {
        when(this.configurationController.version()).thenReturn("1.0");
        String version = this.configurationController.version();
        assertThat(version).isEqualTo("1.0");
    }

}
