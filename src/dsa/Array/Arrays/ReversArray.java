package dsa.Array.Arrays;

import java.util.Scanner;

public class ReversArray {

    static void Print(int[] arr){
        System.out.println("Sorted Array");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[]  reversArray(int[] arr){
        int j=0;
        int n=arr.length;
        int[] ans=new int[n];
      for(int i=n-1;i>=0;i--) {
       ans[j++]=arr[i];

      }
       return ans;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
   int[] ans=  reversArray(arr);
        Print(ans);
    }

}
