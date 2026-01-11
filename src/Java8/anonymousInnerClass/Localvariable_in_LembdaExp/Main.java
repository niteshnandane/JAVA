package Java8.anonymousInnerClass.Localvariable_in_LembdaExp;
// local variable inside lemdba Expression
public class Main {
int x=20; //instent variable
    static void main() {
        int a = 2;
        doSomething();
    }

    private static void doSomething() {
        // int a=2; //local variable
        Employee employee = () -> {

            return "1000";
        };

        Employee employee1 = new Employee() {
            int x = 10;

            @Override
            public String getSalary() {
                System.out.println(this.x);
                return "1000";
            }

        };
    }
}