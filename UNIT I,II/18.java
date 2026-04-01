class Bank {
    final double rate = 5.0;

    double calculateInterest(double amt) {
        return amt * rate / 100;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.calculateInterest(10000));
    }
}