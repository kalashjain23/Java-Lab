import java.io.*;
class Productt implements Serializable
{
    int pid; String pname; double price;
    Productt(int pid,String pname,double price)
    {
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
    public String toString()
    {
        return pid+" "+pname+" "+price;
    }
}
public class ProductManagement
{
    public static void main(String args[]) throws IOException
    {
        Productt p1=new Productt(1,"Apple",100);
        Productt p2=new Productt(2,"Samsung",200);
        Productt p3=new Productt(3,"Vivo",3000);
        Productt p4=new Productt(4,"Oppo",400);
        Productt p5=new Productt(5,"Nothing",500);
        FileOutputStream fout=new FileOutputStream("ProductDetails.dat");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        out.writeObject(p4);
        out.writeObject(p5);
        out.close();
        fout.close();
        System.out.println("successfull");
    }
}
