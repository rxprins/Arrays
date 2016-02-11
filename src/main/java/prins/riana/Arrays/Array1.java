package prins.riana.Arrays;

public class Array1 extends ArraySuper{

    protected String printArray() {
        String returnItems = "";
        //for (String items  : arrayItems) {
        for (int i = 0; i < arrayItems.length; i++) {
            returnItems +=  arrayItems[i] + "\n";
        }
        return returnItems.trim();
    }
}

