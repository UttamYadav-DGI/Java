package OOPS;

class Payment
{
    protected double balance;

    Payment(double balance)
    {
        this.balance=balance;
    }
    void paymentProcess()
    {
        System.out.println("thiry parties have their own method");
    }
    void genereateReciept()
    {
        System.out.println("generate reciept....");
    }
}
class Paytm extends Payment
{
    private String UpiId;
    Paytm(double balance,String UpiId)
    {
        super(balance);
        this.UpiId=UpiId;
    }

    @Override
    void paymentProcess(){
        System.out.println("scan QR");
        System.out.println("communicate with bank");
        System.out.println("check server connections");
        System.out.println("processing payemnts");
        System.out.println("upiId "+UpiId);
        System.out.println("Amount: "+balance);
        System.out.println("payment successfull");
    }
}

public class ComplexOverriding {
    public static void main(String[] args)
    {
        Paytm p1=new Paytm(5000.0,"78uh78ufbeufefuewufwefj");
        p1.paymentProcess();

    }
}
