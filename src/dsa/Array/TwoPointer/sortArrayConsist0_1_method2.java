// sort an Array consisting of only 0s and 1s
package dsa.Array.TwoPointer;

import java.util.Scanner;

public class sortArrayConsist0_1_method2 {

    static void Print(int[] arr){
        System.out.println("Print Array");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
static void sortZeoesAndOnes(int[] arr){
int n= arr.length;
int left=0,right=n-1;
while(left<right){
    if(arr[left]==1 && arr[right]==0){
        swap(arr,left,right);
        left++;
        right--;

    }
    if(arr[left]==0){
        left++;
    }
    if(arr[right]==1){
        right--;
    }
}

}

    static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Array size");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array element");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        Print(arr);
        sortZeoesAndOnes(arr);
        System.out.println("Sorted Array");
        Print(arr);
    }
}
