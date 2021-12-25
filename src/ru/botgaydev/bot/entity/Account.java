package ru.botgaydev.bot.entity;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String tgId;
    private String tgUserName;
    private Integer balance;

    public Account() {

    }

    public Account(String tgId, String tgUserName) {
        this.tgId = tgId;
        this.tgUserName = tgUserName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTgId() {
        return tgId;
    }

    public void setTgId(String tgId) {
        this.tgId = tgId;
    }

    public String getTgUserName() {
        return tgUserName;
    }

    public void setTgUserName(String tgUserName) {
        this.tgUserName = tgUserName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
