package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        System.out.println(charger.about());
        System.out.println(another.about());
    }
}