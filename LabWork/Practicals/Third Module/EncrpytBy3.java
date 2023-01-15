import java.io.*;

public class EncrpytBy3{
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream out = new FileOutputStream("output.txt");

        int i;
        while((i = in.read()) != -1){
            out.write(i + 3);
        }

        in.close();
        out.close();
        System.out.println("Encrypted Successfully");
    }
}
