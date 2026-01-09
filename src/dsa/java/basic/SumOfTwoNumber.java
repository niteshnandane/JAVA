package dsa.java.basic;

import java.util.Scanner;

public class SumOfTwoNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1=sc.nextInt();

        System.out.println("Enter second number:");
        int num2=sc.nextInt();

        System.out.println("Sum of:" +(num1+num2));

    }
}
