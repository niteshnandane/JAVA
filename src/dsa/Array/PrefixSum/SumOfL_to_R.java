/*
Given an array of integer of size n. Answer q queries where you need to print the sum
of values in a given range of indices from 1 tor (both included)
Note:the values of 1 and r in queries follow 1-based indexing.
 */
package dsa.Array.PrefixSum;

import java.util.Scanner;

public class SumOfL_to_R {


    static int[] makePrefixSumArray(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }

        return arr;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Array Element");
        for(int i=1;i<= n;i++){
            arr[i]=sc.nextInt();
        }

        int[] prefSum=makePrefixSumArray(arr);
        System.out.println("Enter number Of Queries");
        int q=sc.nextInt();
        while(q-- > 0){
            System.out.println("enter ranage");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("Sum :"+ans);
        }

    }
}
