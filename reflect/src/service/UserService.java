package service;

public class UserService {
    public boolean logIn(String name,String password){
        if("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }

    public void logOut(){
        System.out.println("系统已退出");
    }
}
