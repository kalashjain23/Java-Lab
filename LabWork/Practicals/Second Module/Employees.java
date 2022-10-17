class ClassForEmployee
{
    private static int netIncome = 0; // This remains same for every instance of this class
    private int rate; // Cannot be accessed out of this class but can be changed through the methods built below
    private String name; // Cannot be accessed out of this class but can be changed through the methods built below

    public ClassForEmployee(String name, int rate) // Constructor with 2 parameters
    {
        this.name = name;
        this.rate = rate;
        netIncome += rate;
    }

    public ClassForEmployee() // Empty constructor
    {
        this("", 0);
    }

    void setInfo(String name, int rate) // Sets the value of the objects of this class
    {
        netIncome += rate - this.rate;
        this.name = name;
        this.rate = rate;
    }

    void getInfo() // Prints the information about the particular object of this class
    {
        System.out.println("Name of the employee is: " + this.name);
        System.out.println("Rate of the employee is: " + this.rate);
    }

    void getNetIncome() // Prints the netIncome
    {
        System.out.println("Net income is: " + netIncome);
    }
}

public class Employees
{
    public static void main(String[] args)
    {
        ClassForEmployee emp1 = new ClassForEmployee(); // Creating an object of class EmployeeClass
        ClassForEmployee emp2 = new ClassForEmployee("Kalash", 5000); // Creating another object of class EmployeeClass

        emp1.setInfo("Test", 3000); // Setting information for employee 1
        emp2.setInfo("Kalash", 10000); // Setting information for employee 2
        emp2.getInfo(); // Getting information for employee 2
        emp1.getInfo(); // Getting information for employee 1

        emp1.getNetIncome(); // The netIncome variable is static, so it will be the same for all the instances of the class EmployeeClass
        emp2.getNetIncome();
    }
}
