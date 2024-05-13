package ru.job4j.enumeration;

public class CarService {

    public static void main(String[] args) {
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
        switch (status) {
            case ACCEPTED:
                System.out.println("Статус: Автомобиль принят на СТО");
                break;
            case IN_WORK:
                System.out.println("Статус: Автомобиль в работе");
                break;
            case WAITING:
                System.out.println("Статус: Автомобиль ожидает запчасти");
                break;
            case FINISHED:
                System.out.println("Статус: Все работы завершены");
                break;
            default:
        }
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        Order order1 = new Order(2, "BMW", Status.WAITING);
        System.out.println("Заказ-наряд №" + order.getNumber()
                + " на автомобиль " + order.getCar()
                + ", статус ремонта: " + order.getStatus().getInfo()
                + ", подробности: " + order.getStatus().getMessage());
        System.out.println("Заказ-наряд №" + order1.getNumber()
                + " на автомобиль " + order1.getCar()
                + ", статус ремонта: " + order1.getStatus().getInfo()
                + ", подробности: " + order1.getStatus().getMessage());
    }
}
