package ru.botgaydev.bot.entity;

public class Good {
    private Integer id;
    private String descr;
    private Integer price;
    private Integer left;
    private Integer available;

    public Good() {

    }

    public Good(String descr, Integer price, Integer left, Integer available) {
        this.descr = descr;
        this.price = price;
        this.left = left;
        this.available = available;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
