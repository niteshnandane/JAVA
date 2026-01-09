package dsa.Array.TwoPointer;

import java.util.Scanner;

public class SortEvenOdd {
    static void Print(int[] arr){
        System.out.println("Print array");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void swap(int[] arr ,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortEvenOdd(int[] arr){
        int n= arr.length;
        int left=0,right=n-1;
        while(left<right) {
            if (arr[left] %2== 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        Print(arr);
        sortEvenOdd(arr);
        System.out.println("sorted Array");
        Print(arr);

    }
}
