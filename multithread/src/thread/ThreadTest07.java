package thread;
/*
关于Thread.sleep()的面试题
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        try {
            //会让t休眠吗?不会
            t.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world!");
    }
}

class MyThread3 extends Thread {
    public void run() {
        for(int i = 0; i < 10000 ;i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}