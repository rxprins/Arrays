package prins.riana.Arrays;

/**
 * Created by rianaprins on 2/10/16.
 */
public class ArraySuper {
    protected String [] arrayItems = {"Sausage","Eggs","Beans", "Bacon", "Tomatoes", "Mushrooms"};
    protected String [] arrayItems2 = {"Sausage","Eggs","Beans", "Beans", "Eggs", "Sausage"};


    public static void main (String [] args) {
        //example 1
        Array1 arrayex1 = new Array1();
        System.out.println("Example 1 " + arrayex1.printArray());
        //example 2
        ArrayLast arrayLast = new ArrayLast();
        System.out.println("Example 2 " + arrayLast.returnLast());
        //example 3
        ArrayButLast arrayBL = new ArrayButLast();
        System.out.println("Example 3 " + arrayBL.returnButLast());
        //example 4
        ArrayReverse arrayReverse = new ArrayReverse();
        System.out.println("Example 4 " + arrayReverse.reverse());
        //example 5
        ArrayPalindromic arrayPalindrome = new ArrayPalindromic();
        System.out.println("Example 5 " + arrayPalindrome.palindrome(arrayPalindrome.arrayItems));
        System.out.println("Example 5 " + arrayPalindrome.palindrome(arrayPalindrome.arrayItems2));
        //example 6
        ArrayDuplicates arrayDuplicate = new ArrayDuplicates();
        System.out.println("Example 6 " + arrayDuplicate.checkDuplicates());
        //example 7
        ArrayPack arrayPack = new ArrayPack();
        System.out.println("Example 7 " + arrayPack.packDuplicates());
    }
}
