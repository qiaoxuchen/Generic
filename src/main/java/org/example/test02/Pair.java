package org.example.test02;

/**
 * 泛型接口的实现类如果是泛型类，那么要保证泛型类的标识包含泛型接口的标识
 *
 * @author qiaogongzi
 * @param <T>
 * @param <E>
 */
public class Pair<T, E> implements Generator<T> {

    private final T key;
    private final E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }
}
