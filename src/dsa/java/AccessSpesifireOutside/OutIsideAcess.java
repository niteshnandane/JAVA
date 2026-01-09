package dsa.java.AccessSpesifireOutside;

import dsa.java.AccessSpecifier.App;

public class OutIsideAcess {

    static void main() {
        App obj=new App();
        System.out.println("Outside of package" +obj.str);

        App3 obj2=new App3();
        obj2.printFromChildClass();
    }

}
// child class
class App3 extends App{
    void printFromChildClass(){
        App obj=new App();
        System.out.println("Access in child class"+obj.str);
    }

}
