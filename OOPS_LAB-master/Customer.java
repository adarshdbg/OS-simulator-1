import java.util.*;
import java.util.Scanner;
class RBI{
    public void getInfo(){
        System.out.println("Base Interest Rate is=8%");
        System.out.println("Minimum Account Balance is=100");
        System.out.println("Max Withdrawal Amount is is=40000");
    }
}
class PNB extends RBI {
    public void getInfo() {
        System.out.println("PNB Interest Rate is=10%");
        System.out.println("Minimum Account Balance is=100");
        System.out.println("Maximum Withdrawal Amount is is=40000");
    }
}
class ICICI extends RBI {
    public void getInfo()
    {
        System.out.println("ICICI Interest Rate is=11%");
        System.out.println("Minimum Account Balance is=1000");
        System.out.println("Maximum_Withdrawal_Amount_is=50000");
    }
}
class SBI extends RBI{
    public void getInfo(){
        System.out.println("SBI Interest Rate is=12%");
        System.out.println("Minimum_Account_Balance_is=500");
        System.out.println("Max_Withdrawal_Amount is=45000");
    }

}
public class Customer{
    public static void main(String args[])
    {
        RBI b;
        b= new PNB();
        b.getInfo();
        System.out.printf("\n");
        b= new SBI();
        b.getInfo();
        System.out.printf("\n");
        b= new ICICI();
        b.getInfo();
        System.out.printf("\n");
    }
}