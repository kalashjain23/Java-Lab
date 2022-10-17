/* Create a class which ask the user to enter a sentence, and it should display count of each vowel type in sentence.
* Display the total count of each vowel for all sentences. */

import java.util.Scanner;

class CountVowel{
    int a, e, i, o, u = 0;
     CountVowel(String str){
        for(char ch : str.toCharArray()){
            switch (ch) {
                case 'A', 'a' -> a++;
                case 'E', 'e' -> e++;
                case 'I', 'i' -> i++;
                case 'O', 'o' -> o++;
                case 'U', 'u' -> u++;
            }
        }
    }
}

public class CountingVowels
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();

        CountVowel obj = new CountVowel(str);

        System.out.println("Total a's: " + obj.a);
        System.out.println("Total e's: " + obj.e);
        System.out.println("Total i's: " + obj.i);
        System.out.println("Total o's: " + obj.o);
        System.out.println("Total u's: " + obj.u);
    }
}
