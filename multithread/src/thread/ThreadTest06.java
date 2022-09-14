package thread;
/*
关于线程的sleep方法:
    static void sleep(long millis)
    1.静态方法
    2.参数是毫秒
    3.让当前线程进入休眠,进入阻塞状态,放弃占有的CPU时间片,让给其他现场(新建,就绪,运行,阻塞,死亡五个状态)
    4.让当前线程进入休眠状态
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        //让当前线程睡眠五秒钟
        /*try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //System.out.println("hello world!");

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
