/**
 * Java1 HomeWork #7
 *
 * @author Dushankovskiy Alexandr
 * @version 31.12.2021 - 02-03.01.2022
 */


public class HomeWorkSeven {
    public static void main(String[]args) {
        Cat[]cats = {
            new Cat("Barsik", 10),
            new Cat("Mirka", 15),
            new Cat("Bredok", 25),
            new Cat("Teak", 5),
            new Cat("Caton", 18)
        };
        Plate plate = new Plate(30);

        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(50);
        plate.info();
    }
}

class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }
    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0)
            return false;

        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }
    void info() {
        System.out.println("plate: " + food);
    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}
