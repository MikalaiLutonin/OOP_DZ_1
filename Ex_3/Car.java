// ======== Доработайте класс Car. 
//          В классе должна храниться следующая информация:
//          Свойство - которое говорит заведен авто или нет
//          Метод - запуска автомобиля
//          Метод - остановки автомобиля
//          Метод дороги - при вызове, в качестве аргумента передаем место назначения
//          И если авто заведён - выводим, что мы на такой-то авто едем место назначения
//          Если не заведён - сообщить, что авто не заведено. И мы не можем ехать

package Ex_3;

public class Car {

    /** Создаем поля класса */
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean isEngine;

    /** Создаем конструктор */
    public Car(String model_x, int year_x, double price_x, String color_x, int power_x) {
        this.model = model_x; // с помощью this мы обращаемся к полям класса
        this.year = year_x;
        this.price = price_x;
        this.color = color_x;
        this.power = power_x;
        this.isEngine = false;
    }

    /** метод распечатки информации о машине */
    public void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }

    // ** метод запуска автомобиля */
    public void start() {
        this.isEngine = true;
        System.out.println("Автомобиль " + this.model + " заведен");
    }

    // ** метод глушения автомобиля */
    public void stop() {
        this.isEngine = false;
        System.out.println("Автомобиль " + this.model + " заглушен");
    }

    // **Метод дороги - при вызове, в качестве аргумента передаем место назначения
    // */
    public void road(String place) {
        if(this.isEngine)
            System.out.println("Автомобиль " + this.model + " едет " + place);
        else
            System.out.println("Автомобиль " + this.model + " никуда не едет");
    }

}
