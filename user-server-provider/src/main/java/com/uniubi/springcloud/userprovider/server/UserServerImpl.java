package com.uniubi.springcloud.userprovider.server;

import com.uniubi.springcloud.userapi.domain.User;
import com.uniubi.springcloud.userapi.server.UserServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/24
 * @Description:
 */
public class UserServerImpl implements UserServer {
    Map<Integer, User> repository = new ConcurrentHashMap<>();


    @Override
    public boolean addUser(User user) {
        return repository.put(user.getAge(),user) == null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(repository.values());
    }
}
