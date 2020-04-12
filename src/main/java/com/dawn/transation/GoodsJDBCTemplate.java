package com.dawn.transation;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Dawn on 2020-04-12.
 */
public class GoodsJDBCTemplate implements GoodsDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager platformTransactionManager;
    public void setDataSource(DataSource ds) {
       this.dataSource = ds;
       this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    public void create(String name, Integer nums, String marks, Integer year) {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = platformTransactionManager.getTransaction(transactionDefinition);
        try{
          String SQL1 = "insert into Goods(name,nums)values(?,?)";
          jdbcTemplate.update(SQL1,name,nums);

          String SQL2="select max(id) from Goods";
          int gid=jdbcTemplate.queryForObject(SQL2,new Object[]{},Integer.class);
          String SQL3="insert into marks(gid,marks,year)values(?,?,?)";

          jdbcTemplate.update(SQL3,gid,marks,year);
          System.out.println("Created name="+name+" nums="+nums);
          //提交事物
           platformTransactionManager.commit(transactionStatus);
        }catch (DataAccessException ex){
            System.out.println("Error in creating record,rolling back");
            //事物回滚
            platformTransactionManager.rollback(transactionStatus);
            throw ex;
        }
        return;
    }

    public List<GoodsMarks> listGoods() {

        String SQL = "select * from goods,marks where goods.id=marks.gid";
        List<GoodsMarks> goodsMarksList = jdbcTemplate.query(SQL,new GoodsMarksMappper());
        return goodsMarksList;
    }
}
