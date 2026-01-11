package Java8.Paredicate_interface.Default_and_static;

import java.util.Objects;
import java.util.function.Predicate;

public class Default_and_static_method_inside_pedicate_interdface {
    static void main() {
     /*   Predicate<Integer> isEven = x ->x%2==0;
        Predicate<String> startsWithLetterV=x ->x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endWithLetterL=x ->x.toLowerCase().charAt(x.length()-1)=='l';
       Predicate<String> and = startsWithLetterV.and(endWithLetterL);
       // System.out.println(and.test("vipull")); //True
        System.out.println(and.test("nitesh")); //false
    */
/*
        Predicate<String> startsWithLetterV=x ->x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endWithLetterL=x ->x.toLowerCase().charAt(x.length()-1)=='l';
        System.out.println(startsWithLetterV.negate().test("vipull")); //false
  */


/*
        Predicate<String> startsWithLetterV=x ->x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endWithLetterL=x ->x.toLowerCase().charAt(x.length()-1)=='l';

        Student s1=new Student("Vipul",1);
        Student s2=new Student("Ram",2);
        Predicate<Student> studentPredicate=x ->x.getId()>1;
        System.out.println(studentPredicate.test(s2)); //true

    }
    private static class Student{
      String name;
      int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

 */

        Predicate<String> startsWithLetterV=x ->x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endWithLetterL=x ->x.toLowerCase().charAt(x.length()-1)=='l';
        Predicate<Object> predicate=Predicate.isEqual("Vipull");
      //  System.out.println(predicate.test("gdhgh")); //false
        System.out.println(predicate.test("Vipull")); //true

    }

}
