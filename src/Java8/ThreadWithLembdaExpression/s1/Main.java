package Java8.ThreadWithLembdaExpression.s1;

public class Main {
    static void main() {

        Runnable runnable= () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("By " + i);
            }
        };
        Thread c=new Thread(runnable);
        c.run();
    }
}
