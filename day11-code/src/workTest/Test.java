package workTest;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("heima001","zhangsan",15000,8000);
        m.eat();
        m.work();

        Cook c = new Cook();
        c.setId("heima002");
        c.setName("lisi");
        c.setSalary(8000);
        c.eat();
        c.work();
    }
}
