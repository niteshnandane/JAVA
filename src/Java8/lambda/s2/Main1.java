package Java8.lambda.s2;

public class Main1 {
    static void main() {

        Employee employee= () -> "Software engineer";
        System.out.println(employee.getName());
    }
}
