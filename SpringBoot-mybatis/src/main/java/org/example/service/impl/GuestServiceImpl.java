package org.example.service.impl;

import org.example.dao.GuestMapper;
import org.example.dao.TkGuestMapper;
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

    //@Autowired
    //private GuestMapper mapper;

    @Autowired
    private TkGuestMapper mapper;
    @Override
    public List<Guest> list() {
        return this.mapper.selectAll();
        //return this.mapper.allGuest();
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
        Guest guest = new Guest();
        guest.setName(name);
        System.out.println(this.mapper.delete(guest));
        return false;
        //return this.mapper.delete(name) == 1;
    }

    @Override
    public boolean update(Guest guest) {
        System.out.println(this.mapper.updateByPrimaryKeySelective(guest));
        return false;
        //return this.mapper.update(guest) == 1;
    }

    @Override
    public Guest getGuest(String name) {
        Guest guest = new Guest();
        guest.setName(name);

        return this.mapper.selectOne(guest);
        //return this.mapper.oneGuest(name);
    }
}
