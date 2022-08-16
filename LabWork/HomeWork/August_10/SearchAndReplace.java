import java.util.Scanner;

public class SearchAndReplace
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine()); // The original string
        char ch = in.next().charAt(0); // The character that needs to be replaced
        char replace_with = in.next().charAt(0); // The character that will take the place of the old character

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                str.setCharAt(i, replace_with); // Replaces the character
                break;
            }
        }
        System.out.println("The new string is: " + str); // Prints the new string
    }
}
