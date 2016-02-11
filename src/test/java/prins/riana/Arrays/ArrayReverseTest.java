package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayReverseTest {
    @Test
    public void arrayReverseSpec() {
        ArrayReverse arrayReverse = new ArrayReverse();
        String expected = ("Mushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage");
        assertEquals("reverse : ",expected,arrayReverse.reverse());
    }
}
