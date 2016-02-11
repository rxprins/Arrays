package prins.riana.Arrays;

/**
 * Created by rianaprins on 2/10/16.
 */
public class ArrayPalindromic extends ArraySuper {
    String[] arrayPalindrome;
    boolean isPalindrome;

    protected boolean palindrome(String[] arrayReceived) {
        arrayPalindrome = arrayReceived;
        int j = arrayPalindrome.length - 1;
        int arrayHalf = arrayPalindrome.length / 2;
        for (int i = 0; i < arrayHalf; i++, j--) {
            if (arrayPalindrome[i] == arrayPalindrome[j]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
