package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;


public class Array1Test {
    @Test
    public void array1Spec() {
        Array1 arrayReverse = new Array1();
        String expected = ("Sausage\nEggs\nBeans\nBacon\nTomatoes\nMushrooms");
        assertEquals("Print all : ",expected,arrayReverse.printArray());
    }
}
