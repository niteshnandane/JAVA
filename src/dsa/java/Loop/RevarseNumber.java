//Reverse the digit of a number
package dsa.java.Loop;

import java.util.Scanner;

public class RevarseNumber {
    static void main() {
        System.out.println("enter the digit:");
       Scanner sc=new Scanner(System.in);
       int num= sc.nextInt();
       int ans=0;
       while(num>0){
           ans=ans*10+num%10;
           num/=10;
       }
        System.out.println(ans);
    }

}
