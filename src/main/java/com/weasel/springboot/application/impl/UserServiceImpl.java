package com.weasel.springboot.application.impl;

import com.weasel.springboot.application.UserService;
import com.weasel.springboot.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author Dylan
 * @date 2016/7/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        return new User();
    }
}
