package threadsafe2;
/*
使用线程同步机制,解决线程安全问题
 */
public class Account {
    //账号
    private String actno;
    //余额
    private double balance;
    //对象
    Object obj = new Object();

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withDraw(double money) {
        //以下代码必须是线程排队的,不能并发
        //一个线程把这里的代码全部执行结束后,另一个线程才能进来
        /*线程同步机制语法:
            synchronized(){
            线程同步代码块
            }
            synchronized后面的小括号中传的这个"数据"是相当关键的
            这个数据必须是多线程共享的数据,才能达到多线程排队
                假设有t1,t2,t3,t4,t5五个线程
                只希望t1,t2,t3排队,t4,t5不排队
                必须在()中写一个t1,t2,t3共享的对象,t4,t5不共享
         */
        //synchronized (this) {
        synchronized (obj){
            double before = this.getBalance();
            double after = before - money;
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            this.setBalance(after);
        }
    }
}
