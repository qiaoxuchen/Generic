package org.example.test06;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author qiaogongzi
 **/
public class TestMain {

    public static void main(String[] args) {

        // 泛型在编译器会擦除，数据在整个编译期会持有它
        // 只允许声明带泛型的数据引用ArrayList<String>[] arrayLists，不能创建带泛型的数据对象new ArrayList<String>[5];
//        ArrayList<String>[] arrayLists = new ArrayList<String>[5];
        ArrayList<String>[] arrayLists = new ArrayList[5];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("123");

        arrayLists[0] = stringArrayList;
        String s = arrayLists[0].get(0);

        System.out.println(s);
        System.out.println("--------------");

        Fruit<String> fruit = new Fruit<String>(String.class, 5);
        fruit.put(0,"苹果");
        fruit.put(1,"香蕉");
        String str = fruit.get(1);
        System.out.println(str);
        String[] array = fruit.getArray();

        System.out.println(Arrays.toString(array));

    }
}
