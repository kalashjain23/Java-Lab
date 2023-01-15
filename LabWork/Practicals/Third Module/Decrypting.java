import java.io.*;

public class Decrypting{
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("output.txt");
        FileOutputStream fout = new FileOutputStream("decrypted.txt");

        int i;
        while((i = fin.read()) != -1){
            fout.write(i - 3);
        }

        fin.close();
        fout.close();
        System.out.println("Decrypted Successfully");
    }
}
