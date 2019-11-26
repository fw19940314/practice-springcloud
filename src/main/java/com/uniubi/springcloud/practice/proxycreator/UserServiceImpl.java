package com.uniubi.springcloud.practice.proxycreator;

/**
 * @Auther: jerry.feng
 * @Date: 2019/9/10
 * @Description:
 */
//@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void print() {
        System.out.println(getClass()+"#print");
    }
}
