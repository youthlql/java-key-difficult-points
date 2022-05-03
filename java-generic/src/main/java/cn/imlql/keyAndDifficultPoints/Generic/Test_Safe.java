package cn.imlql.keyAndDifficultPoints.Generic;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 16:09
 * <p>
 * 功能描述:
 */
public class Test_Safe {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            System.out.println(s);

        }
    }


    public static void test01(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaaa");
        //下面代码编译时就直接报错了
//        arrayList.add(100);

        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            System.out.println(s);

        }
    }
}
