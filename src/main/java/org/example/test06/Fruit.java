package org.example.test06;

import java.lang.reflect.Array;

/**
 * @author qiaogongzi
 **/
public class Fruit<T> {

    private T[] array;

    public Fruit(Class<T> clz, int length) {
        array = (T[]) Array.newInstance(clz, length);
    }

    /**
     * 填充数组
     *
     * @param index
     * @param item
     */
    public void put(int index, T item) {
        array[index] = item;
    }


    /**
     * @param index
     * @return
     */
    public T get(int index) {
        return array[index];
    }

    /**
     * 获取数组所有元素
     *
     * @return
     */
    public T[] getArray() {
        return array;
    }

}
