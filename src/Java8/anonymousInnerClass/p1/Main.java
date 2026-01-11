package Java8.anonymousInnerClass.p1;

public class Main {
    static void main() {
        Employee employee=new Employee() {
            @Override
            public String getSalary() {  //anonymouseInner Class
                return "1000";
            }

            @Override
            public String getDesignation() {  //anonymouseInner Class
                return "Software Engineer";     /* lembda expression using for single class */
            }
        };
        System.out.println(employee.getSalary());
    }
}
