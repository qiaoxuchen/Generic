package org.example.test05;

import java.util.ArrayList;

/**
 * @author qiaogongzi
 **/
public class TestMainUp {

    public static void main(String[] args) {
        ArrayList<Animals> animalsArrayList = new ArrayList<Animals>();
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        ArrayList<MiniCat> miniCatArrayList = new ArrayList<MiniCat>();

        // list添加对象时，只能添加自己或衍生类
        catArrayList.add(new Cat());
        catArrayList.add(new MiniCat());
//        catArrayList.add(new Animals());

//        catArrayList.addAll(animalsArrayList);
        catArrayList.addAll(catArrayList);
        catArrayList.addAll(miniCatArrayList);

        // 因为该方法是上线通配符泛型方法，只能传入Cat或者他的子类，所以传入animalsArrayList报错
//        showAnimal(animalsArrayList);
        showAnimal(catArrayList);
        showAnimal(miniCatArrayList);
    }

    /**
     * 泛型上限通配符，传入的通配符只能是Cat或Cat的子类类型
     *
     * @param list
     */
    public static void showAnimal(ArrayList<? extends Cat> list) {
        // 此处无法确定传过来的参数是什么，所以无法使用添加
//        list.add(new Animals());
//        list.add(new Cat());
//        list.add(new MiniCat());
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }
}
