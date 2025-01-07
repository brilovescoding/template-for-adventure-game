import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void test() {
        Helmet h = new Helmet("Gold");
        assertEquals(1.5, h.getWeight(), .1);
    }
}
