// Print the sum of first n natural numbers, where n is the input
package dsa.java.Loop;

import java.util.Scanner;

public class SumOfNaturalNum {
    static void main() {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        System.out.println("Sum of num:"+ans);
    }
}
