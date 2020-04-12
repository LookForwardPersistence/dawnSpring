package com.dawn.transation;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Dawn on 2020-04-12.
 */
public interface GoodsDAO {

  public void setDataSource(DataSource ds);

  public void create(String name,Integer nums,String marks,Integer year);

  public List<GoodsMarks> listGoods();
}
