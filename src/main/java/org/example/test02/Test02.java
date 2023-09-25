package org.example.test02;

/**
 * @author qiaogongzi
 **/
public class Test02 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Apple apple = new Apple();
        String key = apple.getKey();
        System.out.println(key);
        System.out.println("----------");
        Pair<String, Integer> pair = new Pair<String, Integer>("zhangsan", 10);
        String pairKey = pair.getKey();
        Integer pairValue = pair.getValue();
        System.out.println("pairKey:" + pairKey + ",pairValue:" + pairValue);
    }
}
