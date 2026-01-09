package Myjava.InterfaceDemo.Animal;

public class Test {
    static void main() {
        Dog d=new Dog();
       // d.eat();
        d.sleep();
        System.out.println(d.Max_age);
        System.out.println(Animal.Max_age);
        Animal.info();
        d.run(10,10);
    }
}
