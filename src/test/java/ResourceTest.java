import org.junit.Test;

/**
 * @author rpuch
 */
public class ResourceTest {
    @Test
    public void test() throws ClassNotFoundException {
        Class.forName("javax.annotation.Resource");
    }
}
