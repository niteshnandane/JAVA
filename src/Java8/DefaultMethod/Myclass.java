package Java8.DefaultMethod;

interface A{
    default void say(){
        System.out.println("A say hello");

    }

    interface B{
        default void say(){
            System.out.println("B say hello");

        }
    }
}
public class Myclass implements A, A.B {
    @Override
    public void say() {
        A.super.say();
    }


    static void main() {
      Myclass m=new Myclass();
      m.say();


    }


}
