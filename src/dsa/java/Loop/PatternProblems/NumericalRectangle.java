// Numerical Rectangular pattern
package dsa.java.Loop.PatternProblems;

import java.util.Scanner;

public class NumericalRectangle {
    static void main() {
        System.out.println("Enter the no");
    Scanner sc=new Scanner(System.in);
    int r= sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=i;j<=r;j++){
            System.out.print(j);
        }
        for(int k=1;k<=i-1;k++){
            System.out.print(k);
        }
        System.out.println();
    }
    }
}
