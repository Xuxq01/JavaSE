package threadsafe;
/*
不使用线程同步机制,多线程对同一个账户进行取款,出现线程安全问题
 */
public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

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
        //取款前余额
        double before = this.getBalance();
        //取款后余额
        double after = before - money;

        //模拟一下网络延迟(100%出问题)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //更新余额
        this.setBalance(after);
    }
}
