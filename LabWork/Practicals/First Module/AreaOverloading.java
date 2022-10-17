/* Write a Java program to find area of geometric figures using overloading. */

import java.util.Scanner;

public class AreaOverloading
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side for square: ");
        int side = in.nextInt();
        area(side);

        System.out.print("Enter length and breadth for rectangle: ");
        int length = in.nextInt();
        int breadth = in.nextInt();
        area(length, breadth);
    }

    static void area(int side){
        System.out.println("Area: " + side*side);
    }

    static void area(int l, int b){
        System.out.println("Area: " + l*b);
    }
}
