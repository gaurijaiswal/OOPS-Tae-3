abstract class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String n, double s) { super(n, s); }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String n, double s) { super(n, s); }

    double calculateBonus() {
        return salary * 0.10 + 1000;
    }
}

class Test {
    public static void main(String[] args) {
        Employee e;
        e = new Manager("A", 50000);
        System.out.println(e.calculateBonus());

        e = new Developer("B", 40000);
        System.out.println(e.calculateBonus());
    }
}