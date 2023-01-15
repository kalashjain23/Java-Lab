class Branch{
    static int net_worth = 50000;
    static int no_of_account = 0;
    static int loan_history = 0;

    public static void inspection(){
        System.out.println("Net worth of the branch: " + net_worth);
        System.out.println("Total accounts: " + no_of_account);
        System.out.println("Total amount of loan sanctioned till now: " + loan_history);
    }
}

class Customer extends Branch{
    int cus_number;
    String name;
    int account_bal;
    int loan_sanctioned = 0;

    Customer(String name, int account_bal){
        this.name = name;
        this.cus_number = no_of_account + 1;
        this.account_bal = account_bal;
        net_worth += this.account_bal;
        no_of_account++;
    }

    boolean is_eligible(int amount){
        if(amount <= 2*this.account_bal && amount <= net_worth) return true;
        else return false;
    }

    void get_loan(int amount){
        if(is_eligible(amount)){
            System.out.println("Successfully sanctioned a loan!");
            this.loan_sanctioned += amount;
            net_worth -= amount;
            loan_history += amount;
        }

        else{
            System.out.println("The requested amount should be less than 2 times of your account balance.\nYour balance: " + this.account_bal + "\nRequested Amount: " + amount);
        }
    }

    void pay_loan(int amount){
        net_worth += amount;
        if(amount > loan_sanctioned){
            this.account_bal += (amount - this.loan_sanctioned);
            this.loan_sanctioned = 0;
        }
        else this.loan_sanctioned -= amount;
    }

    void view_account(){
        System.out.println("Holder's name: " + this.name);
        System.out.println("Account Balance: " + this.account_bal);
        System.out.println("Loans Sanctioned: " + this.loan_sanctioned);
    }

}

public class Ass_1 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Kalash", 10000);
        c1.view_account();
        c1.get_loan(5000);
        c1.pay_loan(3000);
        c1.view_account();

        Branch.inspection();

    }
}