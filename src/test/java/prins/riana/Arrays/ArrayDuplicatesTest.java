package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayDuplicatesTest {
    @Test
    public void arrayDuplicates() {
        ArrayDuplicates arrayDup = new ArrayDuplicates();
        String expected = ("1 3 2 1 4");
        assertEquals("duplicates : ",expected,arrayDup.checkDuplicates());
    }
}
