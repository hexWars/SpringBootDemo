package top.sehnsucht.user.service.impl;

import org.springframework.stereotype.Service;
import top.sehnsucht.user.entity.User;
import top.sehnsucht.user.mapper.UserMapper;
import top.sehnsucht.user.service.UserService;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getUser(user);
    }
}
