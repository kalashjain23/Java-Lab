/* Write an interactive program to print a string entered in a pyramid form. For instance, the string "stream"
* has to be displayed as follows:
*      S
*     S t
*    S t r
*   S t r e
*  S t r e a
* S t r e a m */

import java.util.Scanner;

public class PyramidString
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();

        char[] string = str.toCharArray();
        int spaces = string.length-1;

        for(int i = 0; i < string.length; i++){
            for(int k = 0; k < spaces; k++){
                System.out.print(" ");
            }
            spaces--;
            for(int j = 0; j <= i; j++){
                System.out.print(string[j] + " ");
            }
            System.out.println();
        }
    }
}
