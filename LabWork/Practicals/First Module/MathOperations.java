/* Write a program to enter two numbers and perform mathematical operations on them. */

import java.util.Scanner;

public class MathOperations
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = in.nextFloat();
        System.out.print("Enter second number: ");
        float b = in.nextFloat();

        System.out.println("+ : " + (a + b));
        System.out.println("- : " + (a - b));
        System.out.println("/ : " + (a / b));
        System.out.println("* : " + (a * b));

    }

}
