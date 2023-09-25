package org.example.test02;

/**
 * 泛型接口的实现类不是泛型类，则要给泛型接口指定明确的泛型
 *
 * @author qiaogongzi
 */
public class Apple implements Generator<String> {


    @Override
    public String getKey() {
        return "hello，我不是泛型类";
    }
}
