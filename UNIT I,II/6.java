class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int id, String name, float b, float h, float d) {
        empno = id; ename = name;
        basic = b; hra = h; da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Gauri", 10000, 2000, 1500);
        e.dispdata();
    }
}