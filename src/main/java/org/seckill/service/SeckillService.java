package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * Created by gray- on 2017/7/21.
 */
public interface SeckillService {

    /**
     * 查询全部秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);


    /**
     * 在秒杀开启是输出秒杀接口的地址，否则输出秒杀的时间和系统时间
     * @param seckillId
     * @return
     */

    Exposer exportSeckillUrl(long seckillId);


    /**
     * 执行秒杀操作，秒杀是否成功未知，所有要抛出异常
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return
     */


    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
    throws SeckillException;

}
