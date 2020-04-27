package org.example.service;

import org.example.pojo.Guest;

import java.util.List;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:55
 * @Description:
 */
public interface GuestService {

    List<Guest> list();

    boolean add(Guest guest);

    boolean delete(String name);

    boolean update(Guest guest);

    Guest getGuest(String name);
}
