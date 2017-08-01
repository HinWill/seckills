package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by gray- on 2017/7/21.
 */
public interface SeckillDao {

    /**
     * 秒杀成功减少库存量
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1 表示更新库存的记录行数
     */

    int rediceNumber(@Param("seckillId") long seckillId, @Param("killTime")Date killTime);

    /**
     * 根据商品ID来进行查询
     * @param seckillId
     * @return 返回商品对象
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量来查询商品列表  offset表示偏移量 limit 表示在偏移量之后所取的记录个数
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
