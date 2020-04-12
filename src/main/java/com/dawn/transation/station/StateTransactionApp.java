package com.dawn.transation.station;

import com.dawn.transation.GoodsMarks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Dawn on 2020-04-12.
 */
public class StateTransactionApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StateTransactionsBeans.xml");
        StateGoodsJDBCTemplate goodsJDBCTemplate = (StateGoodsJDBCTemplate) context.getBean("stateGoodsJDBCTemplate");
        System.out.println("------create-----");
        goodsJDBCTemplate.create("StateOrange1",550,"PingNan",2020);
        goodsJDBCTemplate.create("StateOrange2",650,"SZ",2020);
        goodsJDBCTemplate.create("StateOrange3",750,"GX",2020);

        System.out.println("-----------List all the records-------------");

        List<GoodsMarks> goodsMarksList=goodsJDBCTemplate.listGoods();

        for(GoodsMarks goodsMarks:goodsMarksList){
            System.out.println(goodsMarks.toString());
        }
    }
}
