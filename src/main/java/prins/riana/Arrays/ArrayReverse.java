package prins.riana.Arrays;

/**
 * Created by rianaprins on 2/10/16.
 */
public class ArrayReverse extends ArraySuper {

    protected String reverse() {
        String reverseItems = "";
        for (int j = arrayItems.length -1; j >= 0; j--) {
         reverseItems += arrayItems[j] + "\n";
        }
        return reverseItems.trim();
    }
}
