package com.dawn.jdbc;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Dawn on 2020-04-09.
 */
public interface GoodsDAO {

    public void setDataSource(DataSource ds);

    public void create(Integer free,String name,Integer num);

    public Goods getGoods(Integer id);

    public List<Goods> listGoods();

    public void delete(Integer id);

    public void update(Integer id,Integer free,Integer nums);
}
