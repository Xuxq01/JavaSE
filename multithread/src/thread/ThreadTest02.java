package thread;
/*
实现线程的第一种方式:
    编写一个类,直接继承java.lang.Thread,重写run方法
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法,代码属于主线程,在主栈中运行
        //新建一个分支线程对象
        myThread t = new myThread();

        //启动线程
        //t.run();//不会启动线程,不会分配新的分支栈,这种方式就是单线程
        //start()方法的作用是:启动一个分支线程,在JVM中开辟一个新的栈空间,这段代码任务完成后瞬间就结束了
        //这段代码任务只是为了开辟一个新的栈空间只要新的栈空间开辟出来,start()方法就结束了,线程就启动成功了
        //启动成功的线程会自动调用run方法,并且run方法在分支栈的底部(压栈)
        //run方法在分支栈的栈底部,main方法在主栈的栈底部,run和main是平级的
        t.start();
        //这里的代码还是运行在主线程
        for(int i = 0; i < 1000; i++) {
            System.out.println("主线程---->" + i);
        }
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        //编写程序运行在分支栈中
        for(int i = 0; i < 1000; i++) {
            System.out.println("分支线程---->" + i);
        }
    }
}