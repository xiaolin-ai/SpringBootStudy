package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.GuestMapper;
import org.example.pojo.Guest;
import org.example.service.GuestService;
import org.springframework.stereotype.Service;


/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 1:02
 * @Description: 用于化简service层
 */
@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper, Guest> implements GuestService {


}
