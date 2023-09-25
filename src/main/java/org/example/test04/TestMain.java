package org.example.test04;

/**
 * @author qiaogongzi
 **/
public class TestMain {

    public static void main(String[] args) {
        Box<Number> numberBox = new Box<Number>();
        numberBox.setFirst(100);
        showBox(numberBox);
        System.out.println("------");
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setFirst(200);
        showBox(integerBox);
    }

    /**
     * 通过"?" 代表实参
     * @param box
     */
    private static void showBox(Box<?> box) {
        Object first = box.getFirst();
        System.out.println(first);
    }
}
