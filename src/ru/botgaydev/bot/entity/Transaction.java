package ru.botgaydev.bot.entity;

import java.sql.Timestamp;

public class Transaction {
    private Integer id;
    private Integer sum;
    private String descr;
    private Integer accId;
    private Integer method;
    private Timestamp date;

    public Transaction() {

    }

    public Transaction(Integer sum, String descr, Integer accId, Integer method, Timestamp date) {
        this.sum = sum;
        this.descr = descr;
        this.accId = accId;
        this.method = method;
        this.date = date;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
