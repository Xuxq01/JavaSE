package test.ComTest;

public class UserService {
    public void register (String username, String password) throws IllegalNameException {
        /*
        引用等于null的判断最好放在所有条件的最前面
         */
        /*
        username == null不如写成 null == username防止手误操作写成单等号
         */
        if(username == null || username.length() < 6 || username.length() > 14){
            throw new IllegalNameException("用户名不合法,长度必须在6~14之间");
        }

        System.out.println("注册成功,欢迎" + username);
    }
}
