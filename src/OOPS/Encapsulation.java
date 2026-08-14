package OOPS;

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Encapsulation
{
    public static void main(String[] args)
    {
    BankAccount manoj=new BankAccount();
    manoj.deposit(5000);
   double bal= manoj.getBalance();
        System.out.println("balance is "+bal);

//    manoj.balance  not allowed because the instance variable is private

    }
}