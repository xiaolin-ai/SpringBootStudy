package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 22:40
 * @Description:
 */
@Data
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private Integer id;
}
