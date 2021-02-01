package org.example.dao;

import org.example.pojo.Guest;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-28 14:05
 * @Description: 这是继承自tk-mybatis插件的mapper，常用的对数据库操作方法都可以省略
 */

public interface TkGuestMapper extends Mapper<Guest> {

}
