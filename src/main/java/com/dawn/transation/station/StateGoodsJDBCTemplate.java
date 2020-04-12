package com.dawn.transation.station;

import com.dawn.transation.GoodsDAO;
import com.dawn.transation.GoodsMarks;
import com.dawn.transation.GoodsMarksMappper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * 声明式事物管理
 * Created by Dawn on 2020-04-12.
 */
public class StateGoodsJDBCTemplate implements GoodsDAO {
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource ds) {
         this.jdbcTemplate = new JdbcTemplate(ds);
    }

    public void create(String name, Integer nums, String marks, Integer year) {
       try{
           String SQL1 = "insert into Goods(name,nums)values(?,?)";
           jdbcTemplate.update(SQL1,name,nums);

           String SQL2="select max(id) from Goods";
           int gid=jdbcTemplate.queryForObject(SQL2,new Object[]{},Integer.class);
           String SQL3="insert into marks(gid,marks,year)values(?,?,?)";

           jdbcTemplate.update(SQL3,gid,marks,year);
           System.out.println("Created name="+name+" nums="+nums);

           throw new RuntimeException("simulate Error condition") ;
       }catch (DataAccessException ex){
           System.out.println("Error in creating records");
           throw ex;
       }
    }

    public List<GoodsMarks> listGoods() {
        String SQL = "Select * from goods,marks where goods.id=marks.gid";
        List<GoodsMarks> goodsMarksList = jdbcTemplate.query(SQL, new GoodsMarksMappper());
        return goodsMarksList;
    }
}
