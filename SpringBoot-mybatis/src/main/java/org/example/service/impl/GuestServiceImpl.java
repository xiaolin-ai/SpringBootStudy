package org.example.service.impl;

import org.example.dao.GuestMapper;
import org.example.pojo.Guest;
import org.example.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 1:02
 * @Description:
 */
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Override
    public List<Guest> list() {
        return this.mapper.allGuest();
    }

    @Override
    public boolean add(Guest guest) {
        if (guest != null) {
            this.mapper.insert(guest);
            System.out.println("生成id为 : " + guest.getId());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String name) {
        return this.mapper.delete(name) == 1;
    }

    @Override
    public boolean update(Guest guest) {
        return this.mapper.update(guest) == 1;
    }

    @Override
    public Guest getGuest(String name) {
        return this.mapper.oneGuest(name);
    }
}
