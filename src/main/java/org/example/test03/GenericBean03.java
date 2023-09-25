package org.example.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 抽奖器
 *
 * @author qiaogongzi
 **/
public class GenericBean03<T> {

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

    /**
     * 泛型类成员方法
     *
     * @return
     */
    public T get() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 普通泛型方法：泛型方法
     *
     * @param list
     * @param <E>
     * @return
     */
    public <E> E getList(ArrayList<E> list) {
        return list.get(random.nextInt(list.size()));
    }

    /**
     * 对比普通泛型方法：证明泛型方法中的泛型不受类的泛型影响
     *
     * @param list
     * @param <T>
     * @return
     */
    public <T> T getListT(ArrayList<T> list) {
        return list.get(random.nextInt(list.size()));
    }

    /**
     * 静态的泛型方法，采用多个泛型
     *
     * @param t
     * @param e
     * @param k
     * @param <T>
     * @param <E>
     * @param <K>
     */
    public static <T, E, K> void printType(T t, E e, K k) {
        System.out.println(t + "\t" + t.getClass().getSimpleName());
        System.out.println(e + "\t" + e.getClass().getSimpleName());
        System.out.println(k + "\t" + k.getClass().getSimpleName());

    }

    /**
     * 静态泛型可变参数,E...支持传入多个类型 例如："a",1,true
     *
     * @param e
     * @param <E>
     */
    public static <E> void print(E... e) {
        for (E e1 : e) {
            System.out.println(e1);
        }
    }
}

