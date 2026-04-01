class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treating patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assisting");
    }
}

class Test {
    public static void main(String[] args) {
        Staff s = new Doctor();
        s.work();
    }
}