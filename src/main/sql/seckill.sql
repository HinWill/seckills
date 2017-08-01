--  数据库初始化脚本

--创建数据库
CREATE DATABASE seckill;

--使用数据库
user seckill;

--创建数据表

CREATE TABLE seckill(
 `seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存ID',
 `name` VARCHAR(120) NOT NULL COMMENT '商品名称',
 `number` int NOT NULL COMMENT '商品库存量',
 `start_time` TIMESTAMP NOT NULL COMMENT '秒杀时间的开始',
 `end_time` TIMESTAMP NOT NULL COMMENT '秒杀时间的结束',
 `create_time` TIMESTAMP NOT NULL CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY(seckill_id),
  key idx_start_time(start_time),
  key idx_end_time(end_time),
  key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf-8 COMMENT='秒杀库存表';

--初始化数据

INSERT INTO seckill(name,number,start_time,end_time,create_time)
    VALUES
      ('1000元秒杀iPhone',100,'2016-02-23 00:00:00','2016-02-24 00:00:00'),
      ('800元秒杀ipad',200,'2016-01-01 00:00:00','2016-01-02 00:00:00'),
      ('6600元秒杀mac book pro',300,'2016-01-01 00:00:00','2016-01-02 00:00:00'),
      ('7000元秒杀iMac',400,'2016-01-01 00:00:00','2016-01-02 00:00:00');



--秒杀成功明细表

CREATE TABLE success_killed(
  `seckill_id` BIGINT NOT NULL COMMENT '秒杀商品ID',
  `user_phone` BIGINT NOT NULL COMMENT '用户手机号',
  `state` TINYINT NOT NULL DEFAULT -1 COMMENT '状态标示： -1：表示无效   0：表示成功  1：已付款  2：已发货',
  `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
  PRIMARY KEY(seckill_id,user_phone),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf-8 COMMENT='秒杀成功明细';
