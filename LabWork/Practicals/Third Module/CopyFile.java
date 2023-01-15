import java.io.*;

public class CopyFile{
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream("output.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        int i;
        while((i = bin.read()) != -1){
            bout.write(i);
        }

        bin.close();
        bout.close();
        fin.close();
        fout.close();
        System.out.println("Done");

    }
}
