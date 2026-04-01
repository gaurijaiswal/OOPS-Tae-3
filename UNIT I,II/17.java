class Employee {
    static int count = 0;

    Employee() {
        count++;
    }

    static void showCount() {
        System.out.println("Total employees: " + count);
    }

    public static void main(String[] args) {
        new Employee();
        new Employee();
        new Employee();
        showCount();
    }
}