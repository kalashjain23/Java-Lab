/* Write a program in Java to find maximum of three numbers using conditional operators. */

import java.util.Scanner;

public class FindMax
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a >= c && a >= b) System.out.println(a + " is maximum.");
        else if(b >= a && b >= c) System.out.println(b + " is maximum.");
        else System.out.println(c + " is maximum");
    }
}
