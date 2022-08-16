import java.util.Scanner;

public class PalindromeCheck
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        boolean is_palindrome = palindrome(str);
        if(is_palindrome){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
    }

    static boolean palindrome(String str){
        int first = 0;
        int last = str.length() - 1;
        while(first < last){
            if(str.charAt(first) == (str.charAt(last))){ // Comparing the characters from the front and the end using two pointers
                first++;
                last--;
            }
            else return false; // If the characters are not equal, it is not a palindrome
        }
        return true; // If passes the loop, it is a palindrome
    }
}
