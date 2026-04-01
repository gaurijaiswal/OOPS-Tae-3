abstract class Shape {
    abstract double calculate_area();

    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }

    double calculate_area() {
        return 3.14 * r * r;
    }
}

class Test {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        s.display();
        System.out.println(s.calculate_area());
    }
}