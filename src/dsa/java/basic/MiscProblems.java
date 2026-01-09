package dsa.java.basic;

import java.sql.SQLOutput;

public class MiscProblems {
    static void swap(int a,int b) {
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("A :"+a);
        System.out.println("B :"+b);

    }
    static void swap2(int a,int b){
        System.out.println("second Method");
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A :"+a);
        System.out.println("B :"+b);
    }

    static void main() {
        int a=10;
        int b=20;
        swap(a,b);
        swap2(a,b);
    }
}
