package collection;
/*
自定义泛型
    自定义泛型的时候,<>尖括号是一个标识符,随便写
    java源代码中出现的一般是<E>和<T>---Element,Type
 */
public class GenericTest03<标识符随便写> {
    public void doSome(标识符随便写 o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        //gt.deSome(100);//类型不匹配

        gt.doSome("abc");

        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(100);
        //gt2.doSome("abc");
    }
}
