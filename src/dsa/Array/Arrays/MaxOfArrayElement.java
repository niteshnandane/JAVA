package dsa.Array.Arrays;

public class MaxOfArrayElement {
    static void main() {
        int[] arr={1,5,3,10,22,35,40};
        int ans=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
        }
        System.out.println("Max Value :"+ans);
    }
}
