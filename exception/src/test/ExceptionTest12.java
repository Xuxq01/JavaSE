package test;
/*
finally
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        try{
            System.out.println("try...");
            //退出JVM不会执行finally
            System.exit(0);
        } finally{
            System.out.println("finally...");
        }
    }
}
