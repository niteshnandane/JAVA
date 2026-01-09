package dsa.java.Loop;

import java.util.Scanner;

public class WhileLoop {
    static void main() {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int num=1;
        while(num<=n){
            System.out.println(num);
//            num=num+1;
            num++;
        }

    }
}
