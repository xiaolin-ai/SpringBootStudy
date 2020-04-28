package org.example.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.pojo.Guest;


/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:39
 * @Description: 继承自mybatis-plus增强包中的BaseMapper接口，用于化简mapper层
 */
public interface GuestMapper extends BaseMapper<Guest> {
}
