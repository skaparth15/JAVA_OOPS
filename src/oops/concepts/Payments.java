package oops.concepts;

public class Payments {
    public static void main(String args[]) throws ClassNotFoundException {
        Polymophism_PaymentMethods paymentMethod =new Polymophism_PaymentMethods();
        paymentMethod.paymentMethod();
        Polymophism_CreditCard paymentMethod_creditcard= new Polymophism_CreditCard();
        paymentMethod_creditcard.paymentMethod();
        paymentMethod_creditcard.transaction_Status();

        Polymophism_PaymentMethods payementMethod_UPI = new Polymophism_UPIPayments();
        payementMethod_UPI.paymentMethod();
    }
}
