package org.maodou.test;

/**
 * @author 毛豆
 * @date 2024/3/1
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void register(String name) {
        System.out.println("register" + name);
    }

    @Override
    public void login(String name) {
        System.out.println("login" + name);
    }
}
