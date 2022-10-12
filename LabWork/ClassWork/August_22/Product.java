class ProductTest{
    int pId;
    String pName;
    int pRate;
    static int count;

    public ProductTest(String pName, int rate){
        pId = 101 + count++;
        this.pName = pName;
        pRate = rate;
    }

    public ProductTest(){
        this("NoName", 0);
    }
}

public class Product
{
    public static void main(String[] args) {
        ProductTest p1 = new ProductTest("name", 2);

        System.out.println("Name is: " + p1.pName);
    }
}
