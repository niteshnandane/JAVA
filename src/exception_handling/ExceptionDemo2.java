package exception_handling;
import java.util.Scanner;
public class ExceptionDemo2 {
    static void main() {
         Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        try {
            arr[6]=10;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
     /*   catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } */
    }
}
