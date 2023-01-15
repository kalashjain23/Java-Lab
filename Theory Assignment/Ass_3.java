class Apparel{
    static int counter = 100;
    String item_type;
    public int price;
    private String item_id;

    Apparel(int price, String item_type){
        this.price = price;
        if(item_type.equals("Silk")){
            this.item_type = "Silk";
            this.item_id = "S" + (++counter);
        }
        else if(item_type.equals("Cotton")){
            this.item_type = "Cotton";
            this.item_id = "C" + (++counter);
        }
    }

    Apparel(String item_type){
        if(item_type.equals("Silk")){
            this.item_id = "S" + (++counter);
        }
        else if(item_type.equals("Cotton")){
            this.item_id = "C" + (++counter);
        }
    }

    int calculate_price(int price, int discount){
        price += (price*discount)/100;
        return price;
    }

    void set_price(int price){
        this.price = price;
    }

    void get_item_id(){
        System.out.println(this.item_id);
    }
}

class Cotton extends Apparel{
    static int discount = 10;
    int price;

    Cotton(int price){
        super(price, "Cotton");
        this.price = price;
    }

    void set_price(int price){
        this.price = price;
    }

    int calculate_price(){
        this.price = super.calculate_price(this.price, discount);
        this.price += this.price/20; // VAT
        this.price -= (this.price*3)/100;

        return this.price;
    }
}

class Silk extends Apparel{
    int price;
    static int discount = 5;
    int points;
    Silk(int price){
        super(price, "Silk");
        this.price = price;
    }

    void set_price(int price){
        this.price = price;
    }

    int calculate_price(){
        this.price = super.calculate_price(this.price, discount);

        if(this.price > 10000) points += 10;
        else points +=3;

        this.price += this.price/10; // VAT

        return this.price;
    }
}

public class Ass_3 {
    public static void main(String[] args) {
        Cotton c1 = new Cotton(1000);
        Silk c2 = new Silk(2000);

        int c1_price = c1.calculate_price();
        int c2_price = c2.calculate_price();

        c1.set_price(3000);
        c1.get_item_id();
        System.out.println("Price: " + c1.price);

        c2.get_item_id();
        System.out.println("Price: " + c2.price);
    }
}
