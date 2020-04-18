package com.dawn.seckill.dao;

import com.dawn.seckill.enity.Seckill;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;


/**
 * Created by Dawn on 2020-04-17.
 */
public class SeckillDaoTest extends BaseTest {

    @Resource
    private SeckillDao seckillDao;


    @Test
    public void getById() throws Exception {
        long id =1000;
        Seckill seckill = seckillDao.getById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void listAll() throws Exception {
        List<Seckill> seckills = seckillDao.listAll(2,20);
        for (Seckill seckill:seckills){
            System.out.println(seckill);
        }
    }

    @Test
    public void reduceProduces() throws Exception {
        Date seckillTime = new Date();

        int sId= seckillDao.reduceProduces(1000L,seckillTime);
        System.out.println(sId);
    }


}