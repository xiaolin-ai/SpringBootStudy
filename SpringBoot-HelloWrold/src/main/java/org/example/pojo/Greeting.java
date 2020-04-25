package org.example.pojo;



/**
 * @Author: aixiaolin
 * @Date: 2020-04-26 1:07
 * @Description:
 */

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;

    }

    public String getContent() {
        return content;
    }
}
