package dsa.java.Loop.NumberSystem;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class BinaryToDecimal {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number :");
        int num=sc.nextInt();
        int ans=0;
        int pw=1;
        while(num>0){
            int unitdigit=num%10;
            ans+=unitdigit*pw;
            pw*=2;
            num/=10;
        }
        System.out.println("Number is:"+ans);
    }
}
