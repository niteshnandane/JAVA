package Java8.ThreadWithLembdaExpression.s2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(23);
        list.add(4);
        list.add(5);
        list.add(6);
        Collections.sort(list,(a,b) ->(b -a));
        System.out.println(list);

    }
}
