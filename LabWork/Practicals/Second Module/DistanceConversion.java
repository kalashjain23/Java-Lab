/* Write a program to create a "distance" class with methods where distance is computed in terms of feet and inches,
create objects of a class. */

/* Modify the "distance" class by creating constructor for assigning values (feet and inches) to the distance object.
Create another object and assign second object as reference variable to another object reference variable. Further,
create a third object which is a clone of the first object. */

import java.util.Scanner;

class Conversion{
    double cm = 0;
    double feet = 0;
    double inches = 0;
    Conversion(double cm){
        this.cm = cm;
        this.feet = (this.cm / 30.48);
        this.inches = (this.cm / 2.54);
    }

    Conversion(Conversion sample){
        this.cm = sample.cm;
        this.feet = sample.feet;
        this.inches = sample.inches;
    }

    public void toFeet(){
        System.out.println("It would be around: " + (this.cm / 30.48) + " feet.");
    }

    public void toInches(){
        System.out.println("It would be around: " + (this.cm / 2.54) + " inches.");
    }
}

public class DistanceConversion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (in cm): ");
        double cm = sc.nextDouble();

        Conversion obj1 = new Conversion(cm);
        Conversion obj2 = new Conversion(obj1);
        Conversion obj3 = obj1;

        obj1.toFeet();
        obj1.toInches();
        System.out.println("Obj2 in feet: " + obj2.feet);
        System.out.println("Obj2 in inches: " + obj2.inches);
        System.out.println("Obj2 in feet: " + obj3.feet);
        System.out.println("Obj2 in inches: " + obj3.inches);
    }
}
