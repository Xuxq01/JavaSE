package thread;
/*
1.如何获取当前线程对象
    Thread t = Thread currentThread()
    返回值t就是当前线程
2.获取线程对象的名字
3.修改线程对象的名字
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        //代码出现在main方法中,所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//main

        MyThread2 t = new MyThread2();
        //设置线程名字
        //t.setName("tttt");
        //获取线程的名字
        System.out.println(t.getName());//Thread-0

        MyThread2 t2 = new MyThread2();
        System.out.println(t2.getName());//Thread-1

        t.start();
    }
}

class MyThread2 extends Thread {
    public void run() {
        for(int i = 0;i < 100; i++) {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + "--->" + i);
        }
    }
}