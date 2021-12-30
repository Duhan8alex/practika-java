/**
 * Java1 HomeWork #6
 *
 * @author Dushankovskiy Alexandr
 * @version 26 - 30.12.2021
 */
class HomWorkSix2 {
    public static void main(String[]args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        IAnimal[]animals = {
            cat,
            dog
        };
        for (IAnimal animal: animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(300));
            System.out.println(animal.run(520));
            System.out.println(animal.swim(8));
            System.out.println(animal.swim(20));
        }
        System.out.println("Animals were created: " + Animal.getCountOfAnimals());
    }
}

class Cat extends Animal {
    Cat(int runLimit) {
        super(runLimit, swimLimit);
    }

    Cat(int runLimit) {
        super(runLimit, -1);
    }

    @Override
    public String swim(int distans) {
        return getClassName() + "can't swim";
    }

}

class Dog extends Animal {
    Dog(int runLimit, int swLimimit) {
        super(runLimit, swimLimit);
    }
}
abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }
    public String getClassName() {
        return className;
    }
    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
    @Override
    public String run(int distans) {
        if (distans > runLimit) {
            return className + "coldn't run " + distans;
        } else {
            return className + " successfully run " + distans;
        }
    }

    @Override
    public String swim(int distans) {
        if (distans > runLimit) {
            return className + " coldn 't swim " + distans;
            } else {
                return className + " successfully swim " + distans;
            }
    }

    @Override
    public String toString() {
            return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
        }
    }
                        
interface IAnimal {
    String run(int distans);
    String swim(int distans);
    }
