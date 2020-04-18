package com.dawn.seckill.dao;

import com.dawn.seckill.enity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Dawn on 2020-04-14.
 */
public interface SeckillDao {

    /**
     *
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceProduces(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 根据偏移量查询秒杀列表(注意多个参数时需要添加@Param注解)
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> listAll(@Param("offset") int offset, @Param("limit") int limit);
}
