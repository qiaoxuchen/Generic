package org.example.test05;

import com.sun.org.apache.xpath.internal.FoundIndex;

import java.util.ArrayList;

/**
 * @author qiaogongzi
 **/
public class TestMainDown {

    public static void main(String[] args) {
        ArrayList<Animals> animalsArrayList = new ArrayList<Animals>();
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        ArrayList<MiniCat> miniCatArrayList = new ArrayList<MiniCat>();

        // 下线通配符只能传入实参类型的父类
        showAnimal(animalsArrayList);
        showAnimal(catArrayList);
//        showAnimal(miniCatArrayList);

    }

    /**
     * 下线泛型的通配符
     *
     * @param list
     */
    public static void showAnimal(ArrayList<? super Cat> list) {
        // 传入进来的都是Cat的父类或本身,所以此处只能添加Cat或者其子类
        list.add(new Cat());
        list.add(new MiniCat());
        // 这里的实体类型是Object，因为传入进来的都是Cat父类，只能用顶级父类接收
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
