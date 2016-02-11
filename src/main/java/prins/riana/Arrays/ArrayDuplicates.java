package prins.riana.Arrays;

/**
 * Created by rianaprins on 2/10/16.
 */
public class ArrayDuplicates {
    int[] numbers = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};

    protected String checkDuplicates() {
        String returnArray = "";
        int duplicate = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != duplicate) {
                returnArray += duplicate + " ";
                duplicate = numbers[i];
            }
        }
        returnArray += duplicate;
        return returnArray;
    }
}