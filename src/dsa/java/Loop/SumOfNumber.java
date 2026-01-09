
// Print sum of series
package dsa.java.Loop;

import java.util.Scanner;

public class SumOfNumber {
    static void main() {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int s=1;
        int ans=0;
        while(s<=n){
            ans+=s;
            s++;
        }
        System.out.println("sum of number:"+ans);
    }
}
