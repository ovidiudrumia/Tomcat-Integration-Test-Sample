import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import static org.fest.assertions.Assertions.assertThat;

public class WebServiceSampleIntegrationTest extends AbstractIntegrationTest {

    public static final String HTTP_LOCALHOST_8080_HELLO_HTML = "http://localhost:8080/hello";

    @Test
    public void helloWorld_givenNothing_thenHelloWorld() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(HTTP_LOCALHOST_8080_HELLO_HTML);
        Response response = target.request().get();
        String value = response.readEntity(String.class);

        assertThat(value).contains("Hello World!");

        response.close();
    }
}
