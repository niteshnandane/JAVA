// Write a program to print the value if it is divisible by 3 or 5
package dsa.java.Operators;

import java.util.Scanner;

public class ConditionalOperaters2 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%3==0 || num%5==0){
            System.out.println("Value is :"+num);
        }
    }
}
