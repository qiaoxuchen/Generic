package org.example.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 抽奖器
 *
 * @author qiaogongzi
 **/
public class GenericBean<T> {

    /**
     * 奖品
     */
    private T product;

    /**
     * 奖品池
     */
    private List<T> list = new ArrayList<T>();

    private final Random random = new Random();

    public void add(T key) {
        list.add(key);
    }

    public T get() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }
}
