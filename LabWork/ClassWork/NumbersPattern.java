import java.util.Scanner;

public class NumbersPattern {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        for(int i = n-1; i > 0; i--){
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
