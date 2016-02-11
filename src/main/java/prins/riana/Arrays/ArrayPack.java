package prins.riana.Arrays;

/**
 * Created by rianaprins on 2/10/16.
 */
public class ArrayPack {
    char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

    protected String packDuplicates() {
        String returnLetters = "";
        char duplicate = letters[0];
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 0) {
                returnLetters = "";
            } else if (letters[i] == duplicate) {
                    returnLetters += letters[i];
                } else {
                    returnLetters += "," + letters[i];
                    duplicate = letters[i];
                }
        }
        return returnLetters;
    }
}
