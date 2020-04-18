-- 数据库脚本

-- 创建数据库
CREATE DATABASE seckills;
-- 使用数据库
use seckills;
-- 创建库存表
CREATE TABLE seckills(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品id',
`name` VARCHAR(120) NOT NULL COMMENT '商品名称',
 `num` int NOT NULL COMMENT '商品数量',
 `start_time` TIMESTAMP NOT NULL COMMENT '秒杀开始时间',
 `end_time` TIMESTAMP NOT  NULL  COMMENT '秒杀结束时间',
 `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 PRIMARY KEY (seckill_id),
 KEY idx_start_time(start_time),
 KEY idx_end_time(end_time),
 KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '秒杀库存表'


-- 初始数据
insert INTO
seckills(name,num,start_time,end_time)
VALUES
('100元秒杀华为手机',100,'2010-04-14 00:00:00','2010-04-15 00:00:00'),
('200元秒杀iphone手机',300,'2010-04-14 00:00:00','2010-04-15 00:00:00'),
('300元秒杀华为ipad',200,'2010-04-14 00:00:00','2010-04-15 00:00:00'),
('500元秒杀华为荣耀手机',500,'2010-04-14 00:00:00','2010-04-15 00:00:00'),
('10元秒杀小米手机',50,'2010-04-14 00:00:00','2010-04-15 00:00:00')


-- 秒杀明细表
CREATE TABLE success_killed(
`seckill_id` bigint NOT NULL comment '商品id',
`phone` bigint NOT NULL comment '用户手机号',
`state` tinyint NOT NULL DEFAULT  -1 comment '状态标识：-1:无效 0：成功 1:已付款 2：已收货',
`create_time` TIMESTAMP NOT  NULL  DEFAULT  CURRENT_TIMESTAMP comment '创建时间',
PRIMARY KEY (seckill_id,phone),
KEY idx_create_time(create_time)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT '秒杀成功明细表'

-- mysql -uroot -p
