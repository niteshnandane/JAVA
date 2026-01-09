package Myjava.InterfaceDemo.Animal;

public interface Animal {
    int Max_age=20;
     void eat();

    void sleep();
    public static void info(){
        System.out.println("this is animal interface");
    }

    default void run(int a,int b){
        this.eat();
        System.out.println("Animal is Running.");
        System.out.println(a+b);
    }

}
