package dsa.java.Loop.NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter decimal No:");
        int num=sc.nextInt();
        int ans=0;
        int pv=1;
        while(num>0){
            int paritydigit=num%2;
            ans+=paritydigit*pv;
            pv*=10;
            num/=2;
        }
        System.out.println("Binary no is:"+ans);
    }
}
