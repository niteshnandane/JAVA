//Print all the values between 1 and 50 except for the multiples of 3.
package dsa.java.Loop;

public class ContinueKeyword {
    static void main() {
     myloop:for(int num=1;num<=50;num++){
          if(num%3==0){
              continue myloop; // Stop and switch next alteration // asigning name
          }
          System.out.println(num);
      }
    }
}
