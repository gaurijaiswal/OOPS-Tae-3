abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class Test {
    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.pay(500);
    }
}