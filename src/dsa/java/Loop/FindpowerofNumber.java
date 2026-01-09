//given 2 numbers a and b. Find a raise ti the power b.
package dsa.java.Loop;

import java.util.Scanner;

public class FindpowerofNumber {
    static void main() {
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*2;
        }
        System.out.println("Ans is :"+ans);
    }
}
