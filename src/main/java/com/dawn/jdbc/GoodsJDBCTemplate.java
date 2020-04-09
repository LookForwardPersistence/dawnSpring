package com.dawn.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Dawn on 2020-04-09.
 */
public class GoodsJDBCTemplate implements GoodsDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(Integer free, String name, Integer num) {
        String SQL="insert into Goods(fee,name,nums)values(?,?,?)";
        jdbcTemplate.update(SQL,free,name,num);
        System.out.println("Created records name:"+name);
        return;
    }

    public Goods getGoods(Integer id) {
        String SQL="select * from Goods where id=?";
        Goods goods = jdbcTemplate.queryForObject(SQL,new Object[]{id},new GoodsMapper());

        return goods;
    }

    public List<Goods> listGoods() {
        String SQL="select * from Goods";
        List<Goods> goods = jdbcTemplate.query(SQL,new GoodsMapper());
        return goods;
    }

    public void delete(Integer id) {
        String SQL = "delete from Goods where id=?";
        jdbcTemplate.update(SQL,id);
        System.out.println("Deleted id:"+id);
        return;
    }

    public void update(Integer id, Integer free, Integer nums) {
        String SQL = "update Goods set fee=?,nums=? where id=?";
        jdbcTemplate.update(SQL,free,nums,id);
        System.out.println("update id="+id);
        return;
    }
}
