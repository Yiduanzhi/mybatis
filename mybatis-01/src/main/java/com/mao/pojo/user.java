package com.mao.pojo;

import lombok.Data;
import lombok.Getter;

//可以用@data和...
//@Data 偷懒专用
@Data
public class user {
    private int id;
    private String name;
    private String pwd;

    public user(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public user() {
    }
}
