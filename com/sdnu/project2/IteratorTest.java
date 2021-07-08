package com.sdnu.project2;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Beyong
 * @Description IteratorTest
 * @date 2021/07/04 14:11
 */

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("taoBao");
        sites.add("jingDong");
        sites.add("tianMao");
        Iterator<String> it = sites.iterator();
        while(it.hasNext()){
            it.next();//删去将会报错
            it.remove();
            break;
            //System.out.println(it.next());
        }
        Iterator<String> myIt = sites.iterator();
        while(myIt.hasNext()){
            System.out.println(myIt.next());
        }
    }
}


