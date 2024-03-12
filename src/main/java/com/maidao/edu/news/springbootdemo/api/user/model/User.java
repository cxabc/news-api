package com.maidao.edu.news.springbootdemo.api.user.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

/**
 * 创建人:chenpeng
 * 创建时间:2019-08-05 10:06
 * Version 1.8.0_211
 * 项目名称：news
 * 类名称:User
 * 类描述:用户实体类
 **/

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String nick;
    @Column
    @JSONField(serialize = false)
    private String password;
    @Column(name = "created_at")
    private long createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
