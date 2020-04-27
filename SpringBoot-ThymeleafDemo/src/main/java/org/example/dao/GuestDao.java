package org.example.dao;

import org.example.pojo.Guest;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:39
 * @Description:
 */
@Repository
public class GuestDao {
    private List<Guest> list;

    {
        this.list = new LinkedList<>();
        this.list.add(new Guest("黄晓明", "店长"));
        this.list.add(new Guest("秦海璐", "财务"));
        this.list.add(new Guest("林某某", "总厨"));
        this.list.add(new Guest("王俊凯", "经理"));
        this.list.add(new Guest("杨紫", "前台"));
    }

    public List<Guest> getList() {
        return this.list;
    }

    public boolean addGuest(Guest guest) {
        return this.list.add(guest);
    }

    public boolean delete(String name) {
        Guest guest = this.getGuest(name);
        if (guest != null) {
            return this.list.remove(guest);
        } else {
            return false;
        }
    }

    public boolean update(Guest guest) {
        Guest origin = this.getGuest(guest.getName());
        if (origin != null) {
            origin.setRole(guest.getRole());
            return true;
        } else {
            return false;
        }
    }

    public Guest getGuest(String name) {
        for (Guest guest : list) {
            if (guest.getName().equals(name)) {
                return guest;
            }
        }
        return null;
    }
}
