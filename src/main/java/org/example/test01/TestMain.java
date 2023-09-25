package org.example.test01;

/**
 * Hello world!
 */
public class TestMain {
    public static void main(String[] args) {
        GenericBean<String> stringProductGetter = new GenericBean<String>();
        String[] strProducts = {"苹果手机", "华为手机", "扫地机器人", "咖啡机"};
        for (int i = 0; i < strProducts.length; i++) {
            stringProductGetter.add(strProducts[i]);
            String product = stringProductGetter.get();
            System.out.println("花喜您，你抽中了：" + product);
        }
        System.out.println("-----------------");
        GenericBean<Integer> integerProductGetter = new GenericBean<Integer>();
        Integer[] integers = {100, 1000, 200, 300};
        for (int i = 0; i < integers.length; i++) {
            integerProductGetter.add(integers[i]);
            Integer integer = integerProductGetter.get();
            System.out.println("花喜您，你抽中了：" + integer);
        }

    }
}
