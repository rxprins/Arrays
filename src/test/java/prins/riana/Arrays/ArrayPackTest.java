package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayPackTest {
    @Test
    public void packDuplicatesSpec() {
        ArrayPack arrayPack = new ArrayPack();
        String expected = ("aaaa,b,cc,aa,d,eeee");
        assertEquals("pack duplicates ",expected,arrayPack.packDuplicates());
    }
}
