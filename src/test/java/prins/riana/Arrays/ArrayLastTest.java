package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLastTest {
    @Test
    public void arrayLastSpec() {
        ArrayLast arrayLast = new ArrayLast();
        assertEquals("get last item in array :","Mushrooms",arrayLast.returnLast());
    }
}
