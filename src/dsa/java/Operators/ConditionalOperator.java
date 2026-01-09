package dsa.java.Operators;

import java.util.Scanner;

public class ConditionalOperator {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String ans;
        ans=(num%2==0) ? "even" : "odd";
        System.out.println(ans);
    }
}
