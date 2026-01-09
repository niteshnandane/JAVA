package dsa.java;

import dsa.java.Packages.pw.skill.App;

public class OutisidePWSkill {

OutisidePWSkill(int a,int b){
    System.out.println(a+b);
    System.out.println("i am constructors");
}
    static void main() {
OutisidePWSkill obj1=new OutisidePWSkill(10,20);

        App obj = new App();
        obj.show();
    }
}