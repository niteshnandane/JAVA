package exception_handling;

import java.util.Scanner;

public class ExceptionDemo {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

      try {
          int res = num1 / num2;
          System.out.println(res);
      }
      catch (ArithmeticException e){
          System.out.println(e);
          System.out.println("divider cant be 0!!");
      }
    }
}
