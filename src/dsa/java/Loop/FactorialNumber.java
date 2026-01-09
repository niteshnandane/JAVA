//Print the first n factorial Number
package dsa.java.Loop;

import java.util.Scanner;

public class FactorialNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println("Factorial NO:"+i+ " is :" +fact);
        }

    }
}
