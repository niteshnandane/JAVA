package dsa.java.basic;

import java.util.Scanner;

public class ReadChar {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter char");
        char ch=sc.next().charAt(3);
        System.out.println("Char :"+ch);
    }
}
