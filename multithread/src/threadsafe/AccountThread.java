package threadsafe;

public class AccountThread extends Thread {
    //两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    public void run() {
        //run方法表示取款操作

        double money = 5000;

        act.withDraw(money);

        System.out.println(Thread.currentThread().getName() + "对" + act.getActno() + "取款" + money + "成功,余额" + act.getBalance());
    }
}
