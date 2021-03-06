package com.dawn.seckill.enity;

import java.util.Date;

/**
 * Created by Dawn on 2020-04-14.
 */
public class SuccessSeckill {

    private long seckillId;

    private long phone;

    private short state;

    private Date createTime;

    private Seckill seckill;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessSeckill{" +
                "seckillId=" + seckillId +
                ", phone=" + phone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
