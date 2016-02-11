package prins.riana.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayPalindromicTest {
    @Test
    public void palindromeTest() {
        ArrayPalindromic arrayPalindrome = new ArrayPalindromic();
        String [] testArray = {"Sausage","Eggs","Beans", "Beans", "Eggs", "Sausage"};
        assertEquals("palindrome :",true,arrayPalindrome.palindrome(testArray));
    }
}
