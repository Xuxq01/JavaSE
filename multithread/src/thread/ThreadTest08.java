package thread;
/*
sleep睡眠太久,如何终止sleep,唤醒睡眠的线程
    不是中断线程的执行,是中断线程的睡眠
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        //假设5秒之后主线程完事
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断t线程睡眠,依靠了java的异常处理机制,让try抛异常执行catch
        t.interrupt();
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + "begin");
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);//子类不能比父类抛出更多的异常,run方法中的异常不能throws
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--->" + "end");

        //doOther();
    }

    //其他方法可以throws
    /*public void doOther() throws Exception{

    }*/
}