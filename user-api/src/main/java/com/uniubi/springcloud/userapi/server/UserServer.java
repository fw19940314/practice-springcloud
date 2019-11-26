package com.uniubi.springcloud.userapi.server;

import com.uniubi.springcloud.userapi.domain.User;

import java.util.List;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/24
 * @Description:
 */
public interface UserServer {
    boolean addUser(User user);

    List<User> getAll();

}
