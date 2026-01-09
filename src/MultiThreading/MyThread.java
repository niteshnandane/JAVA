public class MyThread extends  Thread {
    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getName());

       try{
           Thread.sleep(2000);
           System.out.println("hello");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    static void main() throws InterruptedException {
        MyThread t1=new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(1000); //exception occure for sleep method
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
