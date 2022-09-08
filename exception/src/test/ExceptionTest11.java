package test;
/*
finally语句
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        try和finally没有catch可以吗?可以
            try不能单独使用
            try finally可以联合使用
        以下代码的执行顺序
            先执行try
            在执行finally
            最后执行return(return语句只要执行,方法必然结束)
         */
        try{
            System.out.println("try...");
            return;
        } finally{
            System.out.println("finally...");
        }

        //这里不能写语句,因为无法执行到
        //System.out.println("Hello World");
    }
}
