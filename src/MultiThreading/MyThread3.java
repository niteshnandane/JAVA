public class MyThread3 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("hello");
        }
    }

    static void main() {
        MyThread3 t1=new MyThread3();
        t1.setDaemon(true); //background thread
        System.out.println("hii");
        t1.start();
     //   MyThread3 t2=new MyThread3();
      //  t2.start();
    }
}
