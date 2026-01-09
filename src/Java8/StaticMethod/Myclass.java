package Java8.StaticMethod;

/*  static method
static method in Interface are those methods
which are defined in the interface with the
keyword static

static method contain the complete definition of the function

cannot be overridden or changed int the implementation class

we can call by interface but we cant call by obj
*/
interface A {
    static void sayHello() {
        System.out.println("Say hello");
    }

 /*   default void sayBy() {
        System.out.println("By");
    } */
}
public class Myclass implements A {
     static void main() {
         Myclass obj = new Myclass();
         //  obj.sayBy();
         A.sayHello();
     }
 }

