// Count the number of triplets wo sum is equal to the given values x.
package dsa.Array.Arrays;

public class TripleSum {
    static void main() {
    int[] arr={1,4,5,6,3};
    int target=12;
    int ans=0;
    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j< arr.length;j++){
            for(int k=j+1;k< arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==target){
              ans++;
                }
            }
        }
    }
        System.out.println(ans);
    }
}
