/* Q10. Write a Java program to demonstrate the real scenario of Java method overloading where three classes
are overriding the method of parent class. */

/* Q11. Write a program that implements simple example of Runtime polymorphism with multilevel inheritance. */

/* Q13. Describe abstract class called Shape which has three subclasses say Triangle, Rectangle and Circle.
Define one method area() in the abstract class and override this area() in these subclasses to calculate for
specific i.e, area() of Triangle subclass should calculate area of triangle etc. */

/* Q14. Write a program in Java to demonstrate multiple inheritance. */

abstract class Shape{
    abstract int area();
}

class Triangle extends Shape{
    int base;
    int height;

    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    int area(){
        return (this.base*this.height)/2;
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int area(){
        return (this.length*this.breadth);
    }
}

class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    int area(){
        return (int)3.14*(this.radius*this.radius);
    }
}

public class ShapesQuestion
{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(6,9);
        Triangle t = new Triangle(3,8);

        System.out.println("Circle's Area: " + c.area());
        System.out.println("Rectangle's Area: " + r.area());
        System.out.println("Triangle's Area: " + t.area());

    }

}
