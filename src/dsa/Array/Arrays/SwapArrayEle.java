package dsa.Array.Arrays;

public class SwapArrayEle {
    static void Print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    static void swapArray(int[] arr, int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void swap(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
           swapArray(arr,i,j);
           i++;
           j--;
        }

    }

    static void main() {
        int[] arr={1,2,3,4,5,6};
        swap(arr);
        Print(arr);
    }
}
