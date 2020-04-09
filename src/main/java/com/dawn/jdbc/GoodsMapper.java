package com.dawn.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Dawn on 2020-04-09.
 */
public class GoodsMapper implements RowMapper<Goods>{
    public Goods mapRow(ResultSet resultSet, int i) throws SQLException {
        Goods goods = new Goods();
        goods.setId(resultSet.getInt("id"));
        goods.setFee(resultSet.getInt("fee"));
        goods.setName(resultSet.getString("name"));
        goods.setNums(resultSet.getInt("nums"));
        return goods;
    }
}
