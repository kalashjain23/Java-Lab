class Banks{
    static String bank_name = "Bank Of Daroba";
    private String holder_name;
    private int holder_id;
    private double holder_balance;
    static int total_users = 0;

    public Banks(String name, int id, int balance){
        holder_name = name;
        holder_id = id;
        holder_balance = balance;
        total_users++;
    }

    public Banks(String name, int id){
        holder_name = name;
        holder_id = id;
        holder_balance = 0;
        total_users++;
    }

    public Banks(){
        this("", 0, 0);
    }

    void withdraw(double amount){
        if(amount <= holder_balance){
            System.out.println("Successfully withdrawed $" + amount + " from account ID " + holder_id);
            holder_balance -= amount;
            System.out.println("Current balance is: $" + holder_balance + "\n");
        }
        else{
            System.out.println("Not enough money in account!\n");
        }
    }

    void deposit(double amount){
        holder_balance += amount;
        System.out.println("Succesfully deposited $" + amount + " to account ID " + holder_id);
        System.out.println("Current balance is $" + amount + "\n");
    }

    void setId(int id){
        holder_id = id;
    }

    void setName(String name){
        holder_name = name;
    }

    void setBalance(int balance){
        holder_balance = balance;
    }

    void setInfo(String name, double balance){
        holder_name = name;
        holder_balance = balance;
    }

    void getId(){
        System.out.println("Account ID: " + holder_id + "\n");
    }

    void getName(){
        System.out.println("Name of the account holder: " + holder_name + "\n");
    }

    void getBalance(){
        System.out.println("Balance: $" + holder_balance + "\n");
    }

    void getInfo(){
        System.out.println("Name of the account holder: " + holder_name);
        System.out.println("Account ID: " + holder_id);
        System.out.println("Balance: $" + holder_balance + "\n");
    }
}

public class Banking
{
    public static void main(String[] args) {
        Banks holder1 = new Banks("Kalash", 1, 50000);
        Banks holder2 = new Banks("Palash", 2);
        Banks holder3 = new Banks();

        holder1.withdraw(10000);
        holder2.deposit(60000);
        holder3.setInfo("Talash", 70000);

        holder1.getInfo();
        holder2.getInfo();
        holder3.getInfo();

        System.out.println("Bank: " + Accounts.bank_name);
        System.out.println("Total bank customers: " + Accounts.total_users);
    }
}