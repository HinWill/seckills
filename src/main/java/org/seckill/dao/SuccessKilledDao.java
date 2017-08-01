package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by gray- on 2017/7/21.
 */
public interface SuccessKilledDao {

    /**
     * 插入秒杀明细中，返回为插入行数，根据用户的手机号可以过滤重复，在数据库中使用的联合主键
     * @param seckillId
     * @param userPhone
     * @return 插入的行数 通常插入一行
     */

    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    /**
     * 根据商品的id和用户的手机号 来查询具体的秒杀明细信息（并携带秒伤商品信息）
     * @param seckillId
     * @param userPhone
     * @return 返回秒杀明细
     */
    SuccessKilled queryById(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
