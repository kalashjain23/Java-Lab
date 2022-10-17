/* Write a program to count the number of words that start with capital letters. */

import java.util.Scanner;

public class CapitalLetterInWord
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] string = in.nextLine().split(" ");
        int count = 0;

        for(String word : string){
            if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') count++;
        }

        System.out.println("Total words that start with capital letters are: " + count);
    }
}
