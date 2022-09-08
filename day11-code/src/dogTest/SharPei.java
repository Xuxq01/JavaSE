package dogTest;

public class SharPei extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("啃骨头");
    }
}
