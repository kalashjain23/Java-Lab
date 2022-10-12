import java.io.*;

public class FileTest
{
    public static void main(String[] args)
    {
        FileInputStream fin;
        
        try{
            fin = new FileInputStream("UserDefinedException.java");
            int data = 0;
            while(fin.available() > 0){

            }
        }
        catch (IOException e){

        }
    }
}
