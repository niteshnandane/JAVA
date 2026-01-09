// Print the sum of te stream of integers int the input
package dsa.java.Loop;

import java.util.Scanner;

public class StramOfInterger {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the num:");
        int num=sc.nextInt();
        while(num!= -1){
         sum+=num;
         num=sc.nextInt();

        }
        System.out.println(sum);
    }
}
