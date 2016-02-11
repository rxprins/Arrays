package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayButLastTest {
    @Test
    public void returnButLast() {
        ArrayButLast arrayBL = new ArrayButLast();
        assertEquals("get second last item in array :","Tomatoes",arrayBL.returnButLast());
    }

}
