/* Write a program to accept a line and check how many consonants and vowels are there in line. */

import java.util.Scanner;

public class ConsonantsVowels
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine(); // Getting the line of characters

        int vowels = 0, consonants = 0; // Initialising vowels and consonants to 0
        for(char c : line.toCharArray())
        {
            if((int)(c) >= 65 && (int)(c) <=90) // Checking if the character is capital
            {
                switch (c)
                {
                    case 'A', 'E', 'I', 'O', 'U' -> vowels++;
                    default -> consonants++;
                }
            }
            else if((int)(c) >= 97 && (int)(c) <= 122) // Checking if the character is in small case
            {
                switch (c)
                {
                    case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                    default -> consonants++;
                }
            }
        }

        System.out.println("Total number of vowels: " + vowels); // Printing out the answers
        System.out.println("Total number of consonants: " + consonants);
    }
}
