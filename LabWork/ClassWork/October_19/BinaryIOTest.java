import javax.print.attribute.standard.DateTimeAtCompleted;
import java.io.*;

public class BinaryIOTest
{
    public static void main(String[] args) throws Exception{

        if(args.length > 2){
            String name = args[0];
            float cost = Float.parseFloat(args[1]);
            short stock = Short.parseShort(args[2]);
            DataOutputStream dout = new DataOutputStream(new FileOutputStream("product.dat"));
            dout.writeUTF(name);
            dout.writeFloat(cost);
            dout.close();
        }
        else{
            DataInputStream din = new DataInputStream(new FileInputStream("product.dat"));
            String name = din.readUTF();
            float cost = din.readFloat();
            short stock = din.readShort();
            din.close();
            System.out.println(name + " " + cost + " " + stock);
        }
    }
}
