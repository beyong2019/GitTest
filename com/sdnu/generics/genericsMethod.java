package com.sdnu.generics;

/**
 * @author Beyong
 * @Description genericsMethod
 * @date 2021/07/07 14:18
 */

public class genericsMethod {
    public static <E> void printElement( E[] object){
        for(E element : object){
            System.out.print(element);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer[] integerObject = {1,2,3,4,5,6};
        Double[] doubleObject = {1.0,2.0,3.0,4.0,5.0,6.0};
        String[] stringObject = {"kk", "mm", "ll", "pp"};
        printElement(integerObject);
        printElement(doubleObject);
        printElement(stringObject);
    }
}


