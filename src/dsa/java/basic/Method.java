package dsa.java.basic;

class abc{
    void show(){
        Method m=new Method();
        System.out.println(m.roll_no);
        System.out.println(m.name);
        System.out.println(m.age);
    }
}
public class Method {
    int roll_no=101;
    String name="nitesh";
    int age=20;

    static void main() {
       abc obj=new abc();
       obj.show();
    }
}
