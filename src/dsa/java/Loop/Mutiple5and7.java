//Print the fist multiple of 5 which is also a multiple of 7
package dsa.java.Loop;

public class Mutiple5and7 {
    static void main() {
      int num=1;
      while(true){
          if((num % 5==0) && (num % 7==0)){
              System.out.println("Found ans" +num);
              break;
          }
          num++;
      }
    }
}
