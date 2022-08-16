import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length()-1; i >=0 ; i--){
            reverse.append(str.charAt(i));
        }
        System.out.println("The reversed string is: " + reverse);
    }
}
