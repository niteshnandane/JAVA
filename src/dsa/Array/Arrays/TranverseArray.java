package dsa.Array.Arrays;

import java.sql.SQLOutput;

public class TranverseArray {
    static void main() {
        int arr[]={2,3,4,5,6,8,9,};
        System.out.println("By for loop");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("By for each loop");
        for(int ar:arr){
            System.out.println(ar);
        }
        System.out.println("By While loop");
        int i=0;
        while(i< arr.length){
            System.out.println(arr[i]);
            i++;
        }

        int[][] arr1={{2,3,5,6,2},{4,2,4,1,6},{6,9,10,2,5},{11,32,43,55,78},{21,33,42,421,44}};
        System.out.println("2DArrays");
        for(int k=0;k< arr1.length;k++){
            for(int j=0;j< arr1[k].length;j++){
                System.out.println(arr1[k][j]);
            }
        }
    }
}
