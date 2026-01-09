// Find the sum of the  following series
// s=1-2+3-4...............n
package dsa.java.Loop;
import java.util.Scanner;
public class SumOfSeries {
    static void main() {
        System.out.println("Enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                ans=ans-i;
            }
            else {
                ans=ans+i;
            }
        }
        System.out.println("Ans is :"+ans);
    }
}
