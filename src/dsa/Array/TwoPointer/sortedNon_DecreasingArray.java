/*
Given an integer array 'a' sorted int non-decreasing order, return an array of the squares of
each number sorted in non-deceasing order.
 */
package dsa.Array.TwoPointer;

import java.util.Scanner;

public class sortedNon_DecreasingArray {

    static void Print(int[] arr){
        System.out.println("Print array");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
static void reverse(int[] arr){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        swap(arr,i,j);
        i++;
        j--;
   }

}


    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left=0,right=n-1;
        int[] ans =new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
               ans[k++]=arr[left]*arr[left];
                left++;
            }else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++ ){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array");
        Print(arr);
      int[] ans=  sortSquares(arr);
        System.out.println("sorted Array");
   reverse(ans);
        Print(ans);

    }

}
