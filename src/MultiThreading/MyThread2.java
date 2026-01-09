public class MyThread2 extends Thread {
  public MyThread2(String name){
      super(name);
  }
    @Override

    public void run() {
        for(int i=1;i<=5;i++){

            System.out.println(Thread.currentThread().getName());
              Thread.yield(); // this method give chance to both thread
    }}

    static void main() {
        MyThread2 t1=new MyThread2("t1");
        MyThread2 t2=new MyThread2("t2");
        MyThread2 t3=new MyThread2("t3");
        t1.start();
        t2.start();
        t3.start();

    }
}
// DAEMON Thread :- run in background Thread called deamon Thread