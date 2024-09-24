package com.LJX.HomeWork;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品类
 */
public class Goal {
    private Integer ID;
    private String brand;
    private String color;
    private BigDecimal price;
    public Integer number;
    public Goal(){}

    public Goal(String brand, String color, BigDecimal price, Integer number) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.number = number;
    }


    /**
     * 获取
     * @return ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String toString() {
        return brand + "..." + color + "..." + price + "..."  + number + "\n";
    }
}
