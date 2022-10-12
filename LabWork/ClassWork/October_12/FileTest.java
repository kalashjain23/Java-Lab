import java.io.*;

public class FileTest
{
    public static void main(String[] args)
    {
        FileInputStream fin = null;
        File f = new File("C:\\Users\\kalas\\Desktop\\Java-Lab\\LabWork\\ClassWork\\October_12\\demo.java");

        try{
            fin = new FileInputStream(f);

            int data = 0;

            while(fin.available() > 0){
                data = fin.read();
                System.out.print((char)(data+2));
            }
            System.out.println("Read Successfully!");
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally{
            try{
                fin.close();
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
