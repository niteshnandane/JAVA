package dsa.Array.PrefixSum;

import java.util.Scanner;

public class PrifixSum1 {

    static void printArray(int[] arr){
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
    }

    static int[] makePrefixSumArray(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }

       return arr;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Array Element");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        int[] pref=makePrefixSumArray(arr);
        System.out.println("Prifi Array");
        printArray(pref);
    }
}
