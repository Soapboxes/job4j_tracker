package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("ехать");
    }

    @Override
    public void passanger() {
        int pax;
        System.out.println("Пассажиров: ");
    }


    @Override
    public void fuel() {
        int intFuel;
    }

    @Override
    public int intPrice(int prices) {
        System.out.println("цена топлива: " + prices);
        return 0;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passanger();
        bus.fuel();
        bus.intPrice(50);
    }
}
