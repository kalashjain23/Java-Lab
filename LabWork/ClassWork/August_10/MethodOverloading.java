public class MethodOverloading
{
    public static void main(String[] args)
    {
        System.out.println(sum(9,12));
        System.out.println(sum(5.2f, 2));
        System.out.println(sum(5.2, 3.4));
    }

    static int sum(int a, int b)
    {
        return a + b;
    }

    static float sum(float a, float b){
        return a + b;
    }

    static double sum(double a, double b){
        return a + b;
    }
}
