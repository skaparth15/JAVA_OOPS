package oops.concepts;

public class Polymophism_UPIPayments extends Polymophism_PaymentMethods {
    public void paymentMethod() throws ClassNotFoundException {
        super.paymentMethod();
        //System.out.println("Called from: "+Class.forName("oops.concepts.Polymophism_UPIPayments"));
    }
}
