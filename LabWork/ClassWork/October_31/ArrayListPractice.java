import java.util.*;

class Studs{
    String name;
    int marks;
    Studs(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

class ProductC{
    int num1;
    int num2;

    ProductC(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int get_prod(){
        return this.num1 * this.num2;
    }
}

public class ArrayListPractice{
    public static void main(String[] args) {
        Studs s1 = new Studs("Dhruv", 50);
        Studs s2 = new Studs("Klas", 30);
        Studs s3 = new Studs("def", 50);

        ArrayList<Studs> list = new ArrayList<Studs>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ProductC p1 = new ProductC(5, 6);
        ProductC p2 = new ProductC(7, 8);
        ProductC p3 = new ProductC(2, 9);

        ArrayList<ProductC> list_prod = new ArrayList<ProductC>();
        list_prod.add(p1);
        list_prod.add(p2);
        list_prod.add(p3);

        for (Studs s : list) {
            System.out.println(s.name + ": " + s.marks);
        }

        for(ProductC p : list_prod){
            System.out.println(p.get_prod());
        }

    }
}
