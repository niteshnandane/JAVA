package dsa.java.Loop.PatternProblems;

import java.util.Scanner;

public class Triangular {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r= sc.nextInt();
        for(int i= 1;i<=r;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
