package com.dawn.transation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Dawn on 2020-04-12.
 */
public class TransationApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("TransationBeans.xml");

        GoodsJDBCTemplate goodsJDBCTemplate = (GoodsJDBCTemplate) context.getBean("goodsJDBCTemplate");

        System.out.println("------create-----");
        goodsJDBCTemplate.create("Orange1",550,"PingNan",2020);
        goodsJDBCTemplate.create("Orange2",650,"SZ",2020);
        goodsJDBCTemplate.create("Orange3",750,"GX",2020);

        System.out.println("-----------List all the records-------------");

        List<GoodsMarks> goodsMarksList=goodsJDBCTemplate.listGoods();

        for(GoodsMarks goodsMarks:goodsMarksList){
            System.out.println(goodsMarks.toString());
        }


    }
}
