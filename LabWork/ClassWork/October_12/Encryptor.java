import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encryptor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FileInputStream fin = null;
        FileOutputStream fout = null;
        String path = sc.nextLine();

        try{
            File file = new File(path);
            fin = new FileInputStream(file);
            fout = new FileOutputStream("encrypted_data.txt", true);
            int data = 0;

            while(fin.available() > 0){
                data = fin.read();
                int encrpyt_data = encrypting(data);

                fout.write(encrpyt_data);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            try{
                fin.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
    }

    static int encrypting(int data){
        return data + 2;
    }
}
