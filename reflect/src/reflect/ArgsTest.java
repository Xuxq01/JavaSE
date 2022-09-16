package reflect;
/*
int...args这就是可变长度参数
语法:类型...(一定是三个点)
    1.要求参数个数0~n个
    2.可变长度参数在参数列表中必须在最后一个位置上,而且可变长度参数只能有一个
    3.可变长度参数可以当作数组
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        m2(100);
        m2(200,"abc");
        m2(200,"abc","def","xyz");
        m3("ab","cd","ef","kk","ff");
        String[] strs = {"a","b","c"};
        //也可以传一个数组
        m3(strs);
        m3(new String[]{"我","是","中","国","人"});
    }

    public static void m(int...args){
        System.out.println("m方法执行了!");
    }

    //public static void m2(String...args1,int...args2){}
    public static void m2(int a,String...args1){

    }

    public static void m3(String...args){
        //args有length属性
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}