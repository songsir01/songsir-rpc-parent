package com.songsir.rpc.bean;

import java.io.Serializable;

/**
 * @PackageName com.songsir.rpc.bean
 * @ProjectName songsir-rpc-parent
 * @Author: SongYapeng
 * @Date: Create in 15:37 2019/12/26
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
public class User implements Serializable {

    private Integer uid;

    private String uname;

    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
