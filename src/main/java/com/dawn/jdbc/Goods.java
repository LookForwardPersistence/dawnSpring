package com.dawn.jdbc;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-09.
 */
public class Goods implements Serializable{

    private static final long serialVersionUID = 6394200954364666315L;
    private Integer id;

    private Integer fee;

    private String name;

    private Integer nums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "GoodsDAO{" +
                "id=" + id +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                ", nums=" + nums +
                '}';
    }
}
