package dsa.java.Loop;

import java.util.Scanner;

public class BreakKeyword {
    static void main() {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1; i<=num;i++){
            if(i==9){
                System.out.println(i);
                break;
            }

        }
    }
}
