// Count the number of digit for  a given
package dsa.java.Loop;

import java.util.Scanner;

public class CountOfdigit {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit :");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Count :"+count);
    }

}
