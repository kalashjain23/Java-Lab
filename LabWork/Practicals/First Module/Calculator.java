/* Write a program in Java to create a simple scientific calculator using Math class. */

import java.lang.Math;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Addition: " + Math.addExact(a, b));
        System.out.println("Subtraction: " + Math.subtractExact(a, b));
        System.out.println("Multiplication: " + Math.multiplyExact(a, b));
        System.out.println("Division: " + Math.divideExact(a, b));
    }
}
