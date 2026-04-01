class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Gauri", 18);
        Person p2 = new Person("Rahul", 20);
        p1.display();
        p2.display();
    }
}