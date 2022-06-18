package oops.polymo;

import oops.encaps.Car;

public class PolyExample {
    public static void main(String[] args) {

        PolyExample ca = new PolyExample();

        ca.getCar("Mahdh");

    }

    private Car getCar(String modelName) {
        return new Car(34, "Audi", "AUDI PVT LTD", "German based");
    }

    private Car getCar() {
        return new Car(34, "Audi", "AUDI PVT LTD", "German based");
    }

    private Car getCar(int id) {
        return new Car(34, "Audi", "AUDI PVT LTD", "German based");
    }

    private Car getCar(String modelName, int id) {
        return new Car(34, "Audi", "AUDI PVT LTD", "German based");
    }

    private Car getCar(int id, String manuf) {
        return new Car(34, "Audi", "AUDI PVT LTD", "German based");
    }
}
