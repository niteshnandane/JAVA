package Java8.DefaultMethod;

/*
Default methods Inside Interface

until 1.7 only public abstract method were allowed whether we declare by writing or not

similarly public static final variable were allowed.
since java8  we can have concrete methods as well inside interface
 */

interface parent{
  default void sayHello(){

      System.out.println("hello");
  }
}
class Child implements parent{
    @Override
    public void sayHello() {

        System.out.println("child say Hello");
    }
}
public class defaultMethod {
    static void main() {

        parent c = new Child();
        c.sayHello();
    }
}