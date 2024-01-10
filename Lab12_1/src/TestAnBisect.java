import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestAnBisect {

    @Test
    public void testAnComun() {
        AnBisect anBisect = new AnBisect();
        assertTrue(!anBisect.esteAnBisect(203));
        assertTrue(!anBisect.esteAnBisect(99));
        assertTrue(!anBisect.esteAnBisect(100));
        assertTrue(!anBisect.esteAnBisect(200));
        assertTrue(!anBisect.esteAnBisect(500));
        assertTrue(!anBisect.esteAnBisect(1000));
        assertTrue(!anBisect.esteAnBisect(2018));
    }

    @Test
    public void testAnBisect() {
        AnBisect anBisect = new AnBisect();
        assertTrue(anBisect.esteAnBisect(4));
        assertTrue(anBisect.esteAnBisect(400));
        assertTrue(anBisect.esteAnBisect(1600));
    }
}
