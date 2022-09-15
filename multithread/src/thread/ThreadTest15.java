package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
实现线程的第三种方式:
    实现Callable接口
    优点:可以获取线程的执行结果
    缺点:效率低,当前线程受阻塞
 */
public class ThreadTest15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步:创建一个未来任务类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });

        Thread t = new Thread(task);
        t.start();

        //我们在这里是主线程中,获取t线程的返回结果
        Object obj = task.get();

        //main方法执行必须等待get()方法结束
        //另一个线程执行
        System.out.println("线程执行结果" + obj);
        System.out.println("hello world!");
    }
}
