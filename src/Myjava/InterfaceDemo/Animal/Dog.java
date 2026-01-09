package Myjava.InterfaceDemo.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog is eating ");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleep");


    }
}
