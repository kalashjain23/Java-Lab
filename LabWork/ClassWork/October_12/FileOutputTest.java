import java.io.*;

public class FileOutputTest
{
    public static void main(String[] args)
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        File f = new File("C:\\Users\\kalas\\Desktop\\Java-Lab\\LabWork\\ClassWork\\October_12\\demo.java");

        try{
            fin = new FileInputStream(f);
            fout = new FileOutputStream("democopy.java", true);

            int data = 0;

            while(fin.available() > 0){
                data = fin.read();
                fout.write((char)data);
            }
            System.out.println("Read and write Successfully!");
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally{
            try{
                fin.close();
                fout.close();
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
