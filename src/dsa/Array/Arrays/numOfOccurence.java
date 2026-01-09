package dsa.Array.Arrays;

public class numOfOccurence {
    static int  Occurence(int[] arr,int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans++;
            }
        }
        return ans;
    }
            static int LastOccurence(int[] arr, int x){
                int ans=-1;
                for(int i=0;i< arr.length;i++) {
                    if (arr[i] == x) {
                        ans=i;
                    }
                }
                return ans;
            }


    static void main() {
      int[] arr={5,6,5,1,5};
      int x=5;
        int ans=Occurence(arr,x);
        System.out.println("Count Of :"+ans);

        int ans2=LastOccurence(arr,x);
        System.out.println("Last Occurence :"+ans2);
    }
}
