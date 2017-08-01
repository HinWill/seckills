package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by gray- on 2017/7/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long seckillId = 1000;
        long userPhone = 13837731859L;

        int update = successKilledDao.insertSuccessKilled(seckillId,userPhone);

        System.out.println(update);

    }

    @Test
    public void queryById() throws Exception {

        long seckillId = 1000;
        long userPhone = 13837731859L;
        SuccessKilled successKilled = successKilledDao.queryById(seckillId,userPhone);

        System.out.println(successKilled);

    }

}