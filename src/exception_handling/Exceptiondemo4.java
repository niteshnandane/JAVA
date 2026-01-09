package exception_handling;

import java.util.Scanner;

public class Exceptiondemo4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age < 18) {
            throw new RuntimeException("Sorry you cant Vote!!!");
        }
        else {
            System.out.println("eligible for vote!!!");
        }
    }
}