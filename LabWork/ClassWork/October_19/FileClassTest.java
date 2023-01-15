import java.io.*;

public class FileClassTest
{
    public static void main(String[] args) {
        File fl = new File("text.txt");
        if(fl.exists()){
            System.out.println("File name: " + fl.getName());
            System.out.println("File path name: " + fl.getAbsolutePath());
            System.out.println("File size: " + fl.length());
            System.out.println("File can read: " + fl.canRead());
            System.out.println("File can write: " + fl.canWrite());
            System.out.println("File delete: " + fl.delete());
        }
    }
}
