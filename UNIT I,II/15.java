abstract class Ride {
    int distance;
    Ride(int d) { distance = d; }

    abstract int calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int d) { super(d); }
    int calculateFare() { return distance * 5; }
}

class AutoRide extends Ride {
    AutoRide(int d) { super(d); }
    int calculateFare() { return distance * 8; }
}

class CarRide extends Ride {
    CarRide(int d) { super(d); }
    int calculateFare() { return distance * 12; }
}

class Test {
    public static void main(String[] args) {
        Ride r = new CarRide(10);
        System.out.println(r.calculateFare());
    }
}