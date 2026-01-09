package dsa.Array.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {
     static void disp(int[] pr){
         System.out.println("Print Element");
        for(int i=0;i< pr.length;i++)
            System.out.println(pr[i]);
    }
    static void change(int[] arr){
         for(int i=0;i<arr.length;i++){
             arr[i]=0;
             System.out.println(arr[i]);
         }
    }
    static void main() {
  /*      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Element:");


        for(int i=0;i< arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("Print");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

*/
        int[] arr={2,3,4,4,5};
        System.out.println("Original Array");
        disp(arr);

        int[] arr2=arr;
        System.out.println("Copy Array");
        disp(arr2);




//        changing value
        System.out.println("change values");
        arr2[2]=20;
        arr2[3]=30;
        disp(arr2);

        //Clone method
        int[] arr3=arr.clone();
        System.out.println("Clone method");
        disp(arr3);

//CopyOf Method
        int[] arr4= Arrays.copyOf(arr,arr.length);
        System.out.println("CopyOf Method");
        disp(arr4);

        //copyOfRange method
        int[] arr5=Arrays.copyOfRange(arr,0,3);
        System.out.println("Copy Of Range method");
        disp(arr5);

        // Update val
        System.out.println("Update bye 0"+"change the value bcz  reference create in heap but  in case integer copied value in stack ");
        change(arr);
        disp(arr);
    }
}
