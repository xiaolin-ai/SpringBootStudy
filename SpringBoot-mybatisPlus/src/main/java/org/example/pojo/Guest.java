package org.example.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;



/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:38
 * @Description:
 */
@Data
public class Guest {
    @TableId("id")
    private Integer id;

    private String name;
    private String role;
}
