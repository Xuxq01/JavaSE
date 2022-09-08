package dogTest;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.destoryHome();
        h.lookHome();

        SharPei s = new SharPei();
        s.eat();
        s.drink();
        s.lookHome();

        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();
    }
}
