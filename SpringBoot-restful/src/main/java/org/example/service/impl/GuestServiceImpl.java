package org.example.service.impl;

import org.example.dao.GuestDao;
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
    private GuestDao dao;

    @Override
    public List<Guest> list() {
        return this.dao.getList();
    }

    @Override
    public boolean add(Guest guest) {
        return this.dao.addGuest(guest);
    }

    @Override
    public boolean delete(String name) {
        return this.dao.delete(name);
    }

    @Override
    public boolean update(Guest guest) {
        return this.dao.update(guest);
    }

    @Override
    public Guest getGuest(String name) {
        return this.dao.getGuest(name);
    }
}
