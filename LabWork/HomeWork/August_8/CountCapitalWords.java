import java.util.Arrays;
import java.util.Scanner;

public class CountCapitalWords {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){ // Taking elements of the array from the user
            arr[i] = in.nextLine();
        }
        System.out.println("The original array: " + Arrays.toString(arr)); // Printing out the array

        int count  = 0;
        for(String word : arr){ // A = 65 , Z = 90 : If the integer value of the character at index 0 is between 65 and 90, we can conclude it's a capital letter
            if((int)(word.charAt(0)) > 64 && (int)(word.charAt(0)) < 91) count++;
        }

        System.out.println("Total words starting with capital letters: " + count);
    }
}
