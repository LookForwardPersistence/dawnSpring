package com.dawn.seckill.dao;

import com.dawn.seckill.enity.SuccessSeckill;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Dawn on 2020-04-17.
 */
public class SuccessSeckillDaoTest extends BaseTest{

    @Resource
    SuccessSeckillDao successSeckillDao;
    @Test
    public void insertSuccessSeckill() throws Exception {
        Long phone = 13823879980L;
        int insertFlag = successSeckillDao.insertSuccessSeckill(1000L,phone);
        System.out.println(insertFlag);
    }

    @Test
    public void getSuccessSeckill() throws Exception {
        Long phone = 13823879980L;
        SuccessSeckill successSeckill = successSeckillDao.getSuccessSeckill(1000L,phone);
        System.out.println(successSeckill);
        System.out.println(successSeckill.getSeckill());
    }

}