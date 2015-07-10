import com.cegeka.integrationtestsample.HelloWorldServlet;
import org.jboss.resteasy.plugins.server.tjws.TJWSEmbeddedJaxrsServer;
import org.junit.BeforeClass;

public class AbstractIntegrationTest {

    @BeforeClass
    public static void setup() {
        TJWSEmbeddedJaxrsServer tjws = new TJWSEmbeddedJaxrsServer();
        tjws.setPort(8080);
        tjws.start();
        tjws.addServlet("/hello", new HelloWorldServlet());
    }

}
