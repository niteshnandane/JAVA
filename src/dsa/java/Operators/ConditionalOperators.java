
// Write a program to print the value if it is even and divisible by 3
package dsa.java.Operators;

import java.util.Scanner;

public class ConditionalOperators {
    static void main() {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int value= sc.nextInt();;
        if(value % 2==0 && value %3 ==0){
            System.out.println("Found ans " +value);
        }
    }
}
