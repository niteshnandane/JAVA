package Java8.Paredicate_interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    static void main() {
  /*      Predicate<Integer> predicate= x -> x > 100000;
        System.out.println(predicate.test(1000000));
        int salary=90;
        if(predicate.test(salary)){
    }

   */
        /*
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        for (Integer i : numbers) {
            if (isEven.test(i)) {
                System.out.println(i);
            }
        } */

        Predicate<Integer> isEven =x -> x%2==0;
        Predicate<String> startsWithLetterV= x -> x.charAt(0) == 'v';
        System.out.println(startsWithLetterV.test("vishal"));
    }
}