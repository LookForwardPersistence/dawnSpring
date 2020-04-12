package com.dawn.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Dawn on 2020-04-09.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
        GoodsJDBCTemplate goodsJDBCTemplate = (GoodsJDBCTemplate) context.getBean("goodsJDBCTemplate");
        System.out.println("----------Create---------------");
        goodsJDBCTemplate.create(75,"apple",100);
        goodsJDBCTemplate.create(85,"orange",300);
        goodsJDBCTemplate.create(95,"banana",600);

        System.out.println("---------get GoodsDAO------");
        Goods goods= goodsJDBCTemplate.getGoods(2);
        System.out.println(goods.toString());
        System.out.println("---------get GoodsDAO list--------");
        List<Goods> list= goodsJDBCTemplate.listGoods();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println("-----------update goods------");
        goodsJDBCTemplate.update(3,99,1000);

        System.out.println("---------delete goods--------");
        goodsJDBCTemplate.delete(4);
    }
}
