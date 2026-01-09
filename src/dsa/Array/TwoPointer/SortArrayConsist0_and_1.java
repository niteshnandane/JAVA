// sort an array consisting of only 0s ans 1s
package dsa.Array.TwoPointer;

import java.util.Scanner;

public class SortArrayConsist0_and_1 {

    static void Print(int[] arr) {
        System.out.println("Print array element");
        for(int i=0;i< arr.length;i++){
        System.out.println(arr[i]);
    }
}
/*
static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}

 */
static void sortZerosAndOnes(int[] arr){
        int n= arr.length;
        int zeroes=0;
        //count number
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zeroes++;
        }
    }

    //0 to zeroes-1 : 0, Zeroes to n-1 :1
    for(int i=0;i<n;i++){
        if(i<zeroes){
            arr[i]=0;
        }
        else {
            arr[i]=1;
        }
    }
}

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i< arr.length;i++){
             arr[i]=sc.nextInt();
        }
        Print(arr);
        sortZerosAndOnes(arr);
        Print(arr);
    }
}
