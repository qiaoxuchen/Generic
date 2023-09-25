package org.example.test03;

import com.sun.tools.javac.jvm.Gen;
import sun.font.TrueTypeFont;

import java.util.ArrayList;

/**
 * @author qiaogongzi
 **/
public class TestMain {

    public static void main(String[] args) {
        // 初始化类的泛型为Integer
        GenericBean03<Integer> genericBean = new GenericBean03<Integer>();

        int[] num = {10, 20, 30};
        for (int i : num) {
            genericBean.add(i);
        }
        System.out.println("-------成员方法---------");

        // 泛型类的成员方法的调用
        Integer integer = genericBean.get();
        System.out.println(integer + "\t" + integer.getClass().getSimpleName());

        System.out.println("-------泛型方法---------");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("苹果");
        arrayList.add("香蕉");
        arrayList.add("橘子");
        // 泛型方法的调用：泛型方法通过调用方法时指定类型的
        // 获取普通泛型方法
        String str = genericBean.getList(arrayList);
        System.out.println(str + "\t" + str.getClass().getSimpleName());
        // 获取 对比普通方法，类定义的是integer类型，方法定义的是String类型，这里还是获取到的String类型，由此证明，方法的泛型不受类的泛型类型影响
        String strT = genericBean.getListT(arrayList);
        System.out.println(strT + "\t" + strT.getClass().getSimpleName());

        System.out.println("---------静态泛型方法-------");

        GenericBean03.printType("张三", 10, true);

        System.out.println("---------静态可变参数的泛型方法-------");

        GenericBean03.print("a", 1, true);
        GenericBean03.print(2, 1, 3);
    }
}
