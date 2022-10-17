/*
Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond
will be as follows:
   *
  * *
 * * *
  * *
   *
*/

import java.util.Scanner;

public class DiamondString
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the diamond: ");
        int n = in.nextInt(), spaces = n-1;

        for(int i = 0; i < n; i++){
            for(int j = spaces; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = (n-spaces); j > 0; j--){
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
        spaces = 1;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = (n-spaces); j > 0; j--){
                System.out.print("* ");
            }
            spaces++;
            System.out.println();
        }
    }
}
