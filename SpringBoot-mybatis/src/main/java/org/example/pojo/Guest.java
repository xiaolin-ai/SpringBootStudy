package org.example.pojo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;


/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:38
 * @Description:
 */
@Data
public class Guest {
    @Id
    private Integer id;

    @Column
    private String name;
    private String role;
}
