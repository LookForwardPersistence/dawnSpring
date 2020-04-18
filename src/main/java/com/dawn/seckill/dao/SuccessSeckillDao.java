package com.dawn.seckill.dao;

import com.dawn.seckill.enity.SuccessSeckill;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Dawn on 2020-04-14.
 */
public interface SuccessSeckillDao {

    int insertSuccessSeckill(@Param("seckillId") long seckillId, @Param("phone") long phone);

    SuccessSeckill getSuccessSeckill(@Param("seckillId") long seckillId,@Param("phone") long phone);
}
