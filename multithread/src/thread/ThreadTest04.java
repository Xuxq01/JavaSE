package thread;
/*
采用匿名内部类
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //匿名内部类创建对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("分支线程--->" + i);
                }
            }
        });

        t.start();
        for(int i = 0; i < 100; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}
