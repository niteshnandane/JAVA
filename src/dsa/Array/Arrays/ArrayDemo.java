package dsa.Array.Arrays;

public class ArrayDemo {
    void  arrayDemo(){
        int[] ages=new int[3];
        float[] weights=new float[3];
        String[] names=new String[5];
    try {
        ages[0] = 12;
        ages[1] = 13;
        ages[2] = 14;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        names[0] = "nitesh";
        names[1] = "shubham";
        names[7] = "shourabh";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }

    static void main() {
        ArrayDemo obj=new ArrayDemo();
        obj.arrayDemo();
    }
}
