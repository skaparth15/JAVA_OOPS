package oops.concepts;

public class Polymophism_PaymentMethods {

    public void paymentMethod() throws ClassNotFoundException {
        System.out.println("Called from: "+Class.forName("oops.concepts.Polymophism_PaymentMethods"));
    }


}
