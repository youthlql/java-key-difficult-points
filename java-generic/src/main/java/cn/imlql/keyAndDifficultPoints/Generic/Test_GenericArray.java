package cn.imlql.keyAndDifficultPoints.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 12:10
 * <p>
 * 功能描述: 测试泛型数组
 */
public class Test_GenericArray {

    public static void main(String[] args) {
        test02();
    }

    public static void test() {
        //编译错误
//        List<String>[] ls = new ArrayList<String>[10];
    }


    public static void test01() {
        //这样声明是正确的
        List<?>[] ls = new ArrayList<?>[10];
        ls[1] = new ArrayList<String>();

        //这样写编译就报错了
//        ls[1].add(1);

    }

    /**
     * 下面是sun官方文档里写的。其实不用太纠结，平时泛型虽然用的多，但也不会用的这么奇葩。
     */
    public static void test02(){
        List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Correct.
        Integer i = (Integer) lsa[1].get(0); // OK
        System.out.println(i);
    }

    //正确
    public static void test03() {
        List<String>[] ls = new ArrayList[10];
        ls[0] = new ArrayList<String>();
        ls[1] = new ArrayList<String>();

        ls[0].add("x");

    }

}
