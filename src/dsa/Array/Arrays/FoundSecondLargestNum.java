//Find the second largest element in the given Array
package dsa.Array.Arrays;

public class FoundSecondLargestNum {
    static  int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return  mx;
    }

    static int findSecondMax(int[] arr){
        int mx=findMax(arr);
        for(int i=0;i< arr.length;i++ ){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }
    static void main() {
    int[] arr={2,3,4,6,4};
        System.out.println("Second Max Val:"+findSecondMax(arr));
    }
}
