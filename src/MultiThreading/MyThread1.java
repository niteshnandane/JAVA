public class MyThread1 extends Thread {

    public MyThread1( String name){  // contstructor for create Thread name
        super(name);
    }
    @Override
    public void run() {

        for (int i = 1; i <= 1500; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority : " + Thread.currentThread().getPriority() + " -count :" + i);
            try {
                Thread.sleep(100);


            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }
    static void main(){
      //  MyThread1 sc=new MyThread1("nitesh");
        MyThread1 l=new MyThread1("Low Priority Thread");
        MyThread1 m=new MyThread1("medium Priority Thread");
        MyThread1 n=new MyThread1("high Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();


    }
}
// start ,sleep,join,setPriority