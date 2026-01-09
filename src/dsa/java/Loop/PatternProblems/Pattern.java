//12121212
//21212121
//12121212
//21212121
package dsa.java.Loop.PatternProblems;

import java.util.Scanner;

public class Pattern {
    static void main() {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
            int r= sc.nextInt();
        System.out.println("enter colom");
            int c= sc.nextInt();
            for(int i=1;i<=r;i++){
                for(int j=i;j<=c;j++){
                    if((i+j)%2==0) {
                        System.out.print(1);
                    }
                    else {
                        System.out.print(2);
                    }
                }

                System.out.println();
            }

    }
}
