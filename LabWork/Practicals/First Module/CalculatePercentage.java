/* Write a program that calculates percentage marks of the student if marks of 6 subjects are given. */

import java.util.Scanner;

public class CalculatePercentage
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] marks = new int[6];
        int total = 0;
        for(int i = 0; i < 6; i++){
            int temp = in.nextInt();
            marks[i] = temp;
            total += temp;
        }
        System.out.println("Percentage: " + (total/6));
    }
}
