package dsa.java.AccessSpecifier;

public class App {
    public String str=" i am public member";
    void printFromClass(){
        System.out.println("Within Class:"+str);
    }
    static void main() {
     App obj=new App();
     obj.printFromClass();
        System.out.println("Within class "+obj.str);

        App2 obj2=new App2();
        obj2.printFromOutsideClass();
    }
}
class App2{
    void printFromOutsideClass(){
        App obj=new App();
        System.out.println("with in package but ouside of class "+obj.str);
    }
}