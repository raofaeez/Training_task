class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int m, String f) {
        maxSpeed = m;
        fuelType = f;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int m, String f, int s) {
        super(m, f);
        seatCapacity = s;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int m, String f, int l) {
        super(m, f);
        loadCapacity = l;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int m, String f, boolean g) {
        super(m, f);
        hasGear = g;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + hasGear);
    }
}

public class Vechile {
    public static void main(String[] args) {
        Vehicle[] v = {
            new Car(180, "Petrol", 5),
            new Truck(120, "Diesel", 2000),
            new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle x : v)
            x.displayInfo();
    }
}
