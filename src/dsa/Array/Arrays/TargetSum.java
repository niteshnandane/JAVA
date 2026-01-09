package dsa.Array.Arrays;

public class TargetSum {
    static void main() {
        int[] arr={2,3,1,4,6,5,7,1};
        int target=7,ans=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
