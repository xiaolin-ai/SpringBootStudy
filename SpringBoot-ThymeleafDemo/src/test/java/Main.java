import java.util.Arrays;
import java.util.List;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 1:37
 * @Description:
 */
public class Main {

    /**
     * Arrays.asList获取的list集合不能修改
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tom","jack","alice");
        //list.add("bob");
        //list.remove(1);
        System.out.println(list);

    }
}
