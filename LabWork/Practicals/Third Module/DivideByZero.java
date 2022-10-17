import java.util.Scanner;

public class DivideByZero
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            System.out.println("a/b: " + a/b);
            System.out.println("b/a: " + b/a);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator is 0.");
        }
    }
}
