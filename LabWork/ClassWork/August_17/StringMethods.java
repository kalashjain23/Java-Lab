import java.util.Arrays;

public class StringMethods
{
    public static void main(String[] args)
    {
        String s = "Kalash";
        String s2 = "Github";
        System.out.println(s.length()); // prints the length of the array
        System.out.println(s.toLowerCase()); // converts every character of the string to lowercase
        System.out.println(s.toUpperCase()); // converts every character of the string to uppercase
        System.out.println(Arrays.toString(s.toCharArray())); // converts the string into an array of characters
        System.out.println(s.equals(s2)); // compares the content of the 2 strings
    }
}
