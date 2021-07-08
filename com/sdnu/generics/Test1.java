package com.sdnu.generics;

/**
 * @author Beyong
 * @Description genericsTest
 * @date 2021/07/07 12:27
 */

public class Test1<T> {
    public void methodTest (T temp) {
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Test1<String> object = new Test1<>();
        object.methodTest("kkkkk");
    }
}


