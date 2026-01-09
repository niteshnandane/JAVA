// Find the sum of digit int a given number n
package dsa.java.Loop;
import java.util.Scanner;

public class SumOfDigit {
    static void main() {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num/=10;


        }
        System.out.println("Sum of digit"+sum);
}}
