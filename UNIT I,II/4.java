class Resort {
    int Rno, Days;
    String Name;
    double Charges;

    void Getinfo(int r, String n, double c, int d) {
        Rno = r; Name = n; Charges = c; Days = d;
    }

    double Compute() {
        double amt = Days * Charges;
        if (amt > 11000) amt *= 1.02;
        return amt;
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo(101, "Gauri", 2000, 6);
        r.DispInfo();
    }
}