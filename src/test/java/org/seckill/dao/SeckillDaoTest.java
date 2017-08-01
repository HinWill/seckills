package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by gray- on 2017/7/21.
 * 配置spring和junit4 junit启动时加载springIOC容器
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入DAO 实现类依赖
    @Resource
    private SeckillDao seckillDao;


    @Test
    public void rediceNumber() throws Exception {
        long seckillId = 1000;
        Date date = new Date();
        int update = seckillDao.rediceNumber(seckillId,date);
        System.out.println(update);

    }

    @Test
    public void queryById() throws Exception {
        long seckillId=1000;
        Seckill seckill=seckillDao.queryById(seckillId);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryAll(0,100);

        for(Seckill seckill : seckills){
            System.out.println(seckill);
        }
    }

}