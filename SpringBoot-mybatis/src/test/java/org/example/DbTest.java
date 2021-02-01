package org.example;

import org.example.service.GuestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: aixiaolin
 * @Date: 2021-01-31 16:33
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DbTest {

    @Autowired
    private GuestService service;

    @Test
    public void testDb(){
        System.out.println(this.service.list());
    }
}
