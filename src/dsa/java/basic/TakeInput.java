package dsa.java.basic;
import java.util.Scanner;

public class TakeInput {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
      System.out.println("Enter the number:");
        int num=sc.nextInt();
       System.out.println("Name is :"+name);        System.out.println("number is :" +num);
  }
}
