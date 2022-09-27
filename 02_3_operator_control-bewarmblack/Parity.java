import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Parity {

    public static short getParity(int x) {
        // your code here
        return -1;
    }

    @Test
    public void test() {
        // assertEquals(expected, actual)
        assertEquals(1, Parity.getParity(42));
        assertEquals(0, Parity.getParity(10));
        assertEquals(0, Parity.getParity(-100));
        assertEquals(1, Parity.getParity(-50));
        assertEquals(0, Parity.getParity(12345));
        assertEquals(1, Parity.getParity(85318817));
    }    
}
