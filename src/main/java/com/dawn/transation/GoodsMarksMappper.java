package com.dawn.transation;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Dawn on 2020-04-12.
 */
public class GoodsMarksMappper implements RowMapper<GoodsMarks> {
    public GoodsMarks mapRow(ResultSet resultSet, int i) throws SQLException {
        GoodsMarks goodsMarks = new GoodsMarks();
        goodsMarks.setNums(resultSet.getInt("nums"));
        goodsMarks.setId(resultSet.getInt("id"));
        goodsMarks.setName(resultSet.getString("name"));
        goodsMarks.setGid(resultSet.getInt("gid"));
        goodsMarks.setMarks(resultSet.getString("marks"));
        goodsMarks.setYear(resultSet.getInt("year"));
        return goodsMarks;
    }
}
