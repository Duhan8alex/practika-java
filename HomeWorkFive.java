/**
 * Java1 HomeWork #5
 *
 * @author Dushankovskiy Alexandr
 * @version 25.12.2021
 */
class HomeWorkFive {
    public static void main(String[]arge) {
        Person[] persons = {
        new Person("Vyacheslav Kondratiev", "Techniques", "vk@primer.ru", "6665544", 25000, 45),
        new Person("Ivan Borovoy", "Engineer", "vb@primer.ru", "8884455", 22700, 42),
        new Person("Dmitry Kamnev", "Guard", "dk@primer.ru", "7771234", 14000, 21),
        new Person("Irina Egorova", "Accountant", "ie@primer.ru", "5554789", 45000, 34),
        new Person("Marina Yudina", "Secretary", "my@primer.ru", "4445896", 26800, 38)
        };
        for (Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
     @ Override
    public String toString() {
        return (name + "\n| Position: " + position + "\n| Email: " + email + "\n| Phone: " + phone + "\n| Salary: " + salary + "\n|: " + age);
    }
}
