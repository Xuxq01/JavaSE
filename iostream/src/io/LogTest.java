package io;
//测试工具类logger
public class LogTest {
    public static void main(String[] args) {
        Logger.log("调用了System.gc()方法,建议启动垃圾回收");
        Logger.log("调用了UserService的doSome()方法");
        Logger.log("用户尝试登陆,验证失败");

    }
}
