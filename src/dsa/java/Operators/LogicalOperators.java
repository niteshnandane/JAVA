package dsa.java.Operators;

public class LogicalOperators {
    static void main() {
        int p=15,q=10,r=5;
//       && Operator
        System.out.println((p>q) && (p>r));
        System.out.println((p>q) && (p<r));

//        || Operator
        System.out.println((r<q) || (p<q));
        System.out.println((p>q) || (q>r));
        System.out.println((p<q) || (q<r));

//        ! Operator
        System.out.println(!(p==q));
        System.out.println(!(p>q));
    }
}
