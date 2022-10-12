import java.util.Scanner;

class MyException extends Exception {}
class AnotherException extends Exception{}

public class UserDefinedException
{
    public static void main(String[] args) throws MyException, AnotherException
    {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age > 18)
        {
            throw new MyException();
        }
        else
        {
            throw new AnotherException();
        }
    }
}
