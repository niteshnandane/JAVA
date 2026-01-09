package dsa.java.basic;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal:");
        float s=sc.nextFloat();
        System.out.println("Enter Rate :");
        float r=sc.nextFloat();
        System.out.println("Enter Time:");
        float t=sc.nextFloat();

        float si=s*r*t/100;
        System.out.println("S.I. :"+si);
    }
}
