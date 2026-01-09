package dsa.java.method;

class Algebra{
   int add( int a,int b){
       int ans=a+b;
       return  ans;
   }
}
public class Main {
    static void main() {
    Algebra obj=new Algebra();
   //int ans= obj.add(10,20);
        //System.out.println("Ans :"+ans);
        System.out.println(obj.add(10,20));
    }
}
