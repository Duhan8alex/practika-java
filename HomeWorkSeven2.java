/**
 * Java1 HomeWork #7
 *
 * @author Dushankovskiy Alexandr
 * @version 03.01.2022
 */

public class HomeWorkSeven2 {
    public static void main(String[]args) {
        Cat[]cats = {
            new Cat("Barsik", 10),
            new Cat("Mirka", 15),
            new Cat("Bredok", 25),
            new Cat("Teak", 5),
            new Cat("Caton", 18)
        };
        Plate plate = new Plate(60, 30);

        for (Cat cat: cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.addFood(45);
        System.out.println(plate);

        for (Cat cat: cats) {
            cat.setHungry(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Plate {
    private int volume;
    private int food;
    Plate(int volume, int food) {
        this.volume = volume;
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
        if (this.food + food <= volume){
            this.food += food;
        }
    }
     @ Override
    public String toString() {
        return "plate: " + food;
    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = false;
    }
    void setHungry(boolean status) {
        hungry = status;
    }
     @ Override
    public String toString() {
        return "{name-" + name + ", appetite-" + appetite + ", hungry-" + hungry + "}";
    }

    void eat(Plate plate) {
        if (!hungry) {
            hungry = plate.decreaseFood(appetite);
        }
    }
}
