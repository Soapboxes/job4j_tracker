package ru.job4j.cast;

public class MainVehicle implements Vehicle {

    @Override
    public void move() {
    }

    @Override
    public void passenger() {
    }

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
            object.passenger();
        }
    }
}
