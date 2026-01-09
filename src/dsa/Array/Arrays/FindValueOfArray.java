//Search the given element x in the array. if present then return theindex else
package dsa.Array.Arrays;

public class FindValueOfArray {
    static void main() {
        int[] arr={1,4,3,6,7,2,3,5,2,5};
        int x=5;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                System.out.println("values found the index is :"+i);
                break;
            }

        }

    }
}
