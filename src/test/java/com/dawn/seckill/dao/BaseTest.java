package com.dawn.seckill.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Dawn on 2020-04-18.
 * 增和spring和junit，在junit启动时 启动springioc容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//配置junit的spring配置
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseTest {
}
