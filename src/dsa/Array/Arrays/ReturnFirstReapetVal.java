//given an array 'a' consisting of integres.Return the first value that is repeating in this array. if no value is being repeated return-1
package dsa.Array.Arrays;
public class ReturnFirstReapetVal {

    static int FirstRepeatedVal(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
           for(int j=i+1;j< arr.length;j++){
               if(arr[i]==arr[j]){
                   return arr[i];

               }

           }
        }
return -1;
    }

    static void main() {
int[] arr={3,4,5,6,2,4,3};
int ans=FirstRepeatedVal(arr);
        System.out.println("Ans :"+ans);
    }
}
