package thread;
/*
怎么合理的终止线程执行(常用)
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;//想要什么时候终止t将标记改为false
    }
}

class MyRunnable4 implements Runnable {
    //打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            if(run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                //return前可以保存数据
                return;
            }
        }
    }
}