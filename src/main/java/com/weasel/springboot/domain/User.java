package com.weasel.springboot.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @author Dylan
 * @date 2016/7/20.
 */
public class User implements Serializable{

    private final Logger log = LoggerFactory.getLogger(getClass());

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sayHello(){
        log.info("hello");
    }
}
