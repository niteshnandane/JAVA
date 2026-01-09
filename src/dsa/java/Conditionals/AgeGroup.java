package dsa.java.Conditionals;

import java.util.Scanner;

public class AgeGroup {
    static void main() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age :");
        int age=sc.nextInt();
        if (age <= 12) {
            System.out.println("Child");
        } else if (age> 12 && age <18) {
            System.out.println("Teenager");
        }else{
            System.out.println("adult");
        }
    }
}
