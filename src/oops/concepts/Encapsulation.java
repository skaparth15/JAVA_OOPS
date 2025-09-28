package oops.concepts;
public class Encapsulation{
    private int balance;
    public void deposit(int amount){
        if(amount>0){
            this.balance =balance+amount;
            System.out.println("Amount deposited :"+ amount + "balance :"+ balance);
        }
        else{
            System.out.println("money can't be deposited");
        }
    }

    public  void with_draw(int money){
        if(balance >= money){
            this.balance = balance - money;

            System.out.println("remaining balance :"+balance);
        }
        else{
            System.out.print("no sufficient balance");
        }
    }
    public static void main(String []args){
        Encapsulation ED=new Encapsulation();
        ED.deposit(500);
        ED.with_draw(300);
    }
}



