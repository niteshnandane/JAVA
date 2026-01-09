package exception_handling;

public class ExceptionDemo5 {
    public static void divisiondemo(int divider, int divisor) throws ArithmeticException{
        System.out.println("Result"+ divider/divisor);
    }

    static void main() {
        divisiondemo(10,0);
    }
}
