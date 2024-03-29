package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("ехать");
    }

    @Override
    public void passenger(int pax) {
        System.out.println("Пассажиров: " + pax);
    }

    @Override
    public void fuel() {
        int intFuel;
    }

    @Override
    public int intPrice(int prices) {
        System.out.println("цена топлива: " + prices * 62);
        return 0;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passenger(10);
        bus.fuel();
        bus.intPrice(50);
    }
}
