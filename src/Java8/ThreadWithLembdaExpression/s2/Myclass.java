package Java8.ThreadWithLembdaExpression.s2;

import java.util.Comparator;

public class Myclass implements Comparator<Integer> {
    @Override
    public int compare(Integer a,Integer b) {

        return b-a;
    }
}
