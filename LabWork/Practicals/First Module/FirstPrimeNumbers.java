/* Write a program in Java to generate first n prime numbers. */

import java.util.Scanner;

public class FirstPrimeNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers you want: ");
        int n = in.nextInt(),count = 1, i = 3;
        System.out.print("2");
        while(count < n){
            boolean prime = true;
            for(int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(" "+i);
                count++;
            }
            i++;
        }
    }
}
