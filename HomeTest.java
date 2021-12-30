
class HomeTest {
    public static void main(String[]args) {
        Cat cat = new Cat();
        cat.run(150);
        cat.swim(1);

        Dog dog = new Dog();
        dog.run(400);
        dog.swim(10);    
    }
}
abstract class Animal {
    private int max_runLengeth = 0;
    private int max_swimLengeth = 0;

    abstract void run(int length);
    abstract void swim(int length);

}

class Cat extends Animal {
    private int max_runLengeth = 200;
     @ Override
    void run(int length) {
        if ((length >= 0) && (length <= max_runLengeth))
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

     @ Override
    void swim(int length) {
        System.out.println("swim: false");
    }

}

class Dog extends Animal {
    private int max_runLengeth = 500;
    private int max_swimLengeth = 10;

     @ Override
    void run(int length) {
        if ((length >= 0) && (length <= max_runLengeth))
            System.out.println("run: true");
    }

     @ Override
    void swim(int length) {
        if ((length >= 0) && (length <= max_swimLengeth))
            System.out.println("swim: true");
        else
            System.out.println("swim: false");
    }
}
