package exception_handling;

import java.util.Scanner;

public class ExceptionDemo3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        try {
            System.out.println("i am first block");
            try {
                arr[6] = 10;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
