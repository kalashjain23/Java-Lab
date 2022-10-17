import javax.swing.plaf.synth.SynthMenuItemUI;

abstract class Residency{
    String name;
    int rNumber;
    int area;
    int unit_rate;

    Residency(){
        name = null;
        rNumber = 0;
        area = 0;
        unit_rate = 0;
    }

    Residency(String name, int rNumber, int area, int unit_rate){
        this.name = name;
        this.rNumber = rNumber;
        this.area = area;
        this.unit_rate = unit_rate;
    }

    Residency(Residency r){
        this.name = r.name;
        this.rNumber = r.rNumber;
        this.area = r.area;
        this.unit_rate = r.unit_rate;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getrNumber(){
        return this.rNumber;
    }

    void setrNumber(int rNumber){
        this.rNumber = rNumber;
    }

    int getArea(){
        return this.area;
    }

    void setArea(int area){
        this.area = area;
    }

    int getUnit_rate(){
        return this.unit_rate;
    }

    void setUnit_rate(int unit_rate){
        this.unit_rate = unit_rate;
    }

    abstract long getPriceOfResidency();
}

abstract class Semi_FurnishedResidency extends Residency{
    int furnitureCharge = 3000;
    int parkingCharge = 500;

    Semi_FurnishedResidency(){
        super();
    }

    Semi_FurnishedResidency(String name, int rNumber, int area, int unit_rate){
        this.name = name;
        this.rNumber = rNumber;
        this.area = area;
        this.unit_rate = unit_rate;
    }
}

class LuxuriousResidency extends Residency{
    int amenityCharge = 10000;

    LuxuriousResidency(){
        super();
    }

    LuxuriousResidency(String name, int rNumber, int area, int unit_rate){
        this.name = name;
        this.rNumber = rNumber;
        this.area = area;
        this.unit_rate = unit_rate;
    }

    public long getPriceOfResidency(){
        return super.unit_rate + amenityCharge;
    }
}

interface Rentable{
    int getRent();
}

class TwoBHKResidency extends Semi_FurnishedResidency implements Rentable{
    TwoBHKResidency(){
        super();
    }

    TwoBHKResidency(String name, int rNumber, int area, int unit_rate){
        super(name, rNumber, area, unit_rate);
    }

    public long getPriceOfResidency(){
        return super.parkingCharge + super.furnitureCharge + super.unit_rate;
    }

    public int getRent(){
        return (int)getPriceOfResidency()/20;
    }
}

public class ResidencyQuestion
{
    public static void main(String[] args)
    {
        LuxuriousResidency r1 = new LuxuriousResidency("Antilia", 1, 3000, 50000);
        System.out.println("Price of luxurious residency is: " + r1.getPriceOfResidency());

        Semi_FurnishedResidency r2 = new TwoBHKResidency("AG", 2, 300, 10000);
        System.out.println("Price of semi furnished residency: " + r2.getPriceOfResidency());
        System.out.println("Rent: " + ((Rentable)r2).getRent());
    }
}
