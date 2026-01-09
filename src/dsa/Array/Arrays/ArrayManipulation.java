// Find the unique number in a given Array where all the elements are being repeated twice wiht one value being unique
package dsa.Array.Arrays;

public class ArrayManipulation {
    static int manipulate(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++)
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
        int ans=-1;
        for(int i=0;i< arr.length;i++){

            if(arr[i]>0){
                ans=arr[i];
            }
        }
return ans;
    }
    static void main() {
        int[] arr={1,2,3,4,5,2,1,3};
     int ans= manipulate(arr);
        System.out.println(ans);
    }
}
