package cn.imlql.keyAndDifficultPoints.Wildcard_Character;

import java.util.*;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/16 11:28
 * <p>
 * 功能描述:
 */
public class Test_difference {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();

        //编译报错
//        test(integerList, floatList);
        //编译通过
        test1(integerList, floatList);


        //编译通过
        test(integerList, integerList);
        test1(integerList, integerList);


        /*---------------------测试多重限定符---------------------*/


        List list = new ArrayList<>();
        Queue queue = new ArrayDeque<>();
        LinkedList<Object> linkedList = new LinkedList<>();
           //多重限定时，在编译的时候取最小范围或共同子类

        test2(list);
//        test3(list); 编译报错
        test4(list);


        //编译报错
//        test2(deque);
//        test3(deque);
//        test4(queue);

        //编译通过
        test2(linkedList);
        test3(linkedList);
        test4(linkedList);


    }


    // 通过 T 来 确保 泛型参数的一致性
    public static <T extends Number> void test(List<T> dest, List<T> src) {

    }

    //通配符是 不确定的，所以这个方法不能保证两个 List 具有相同的元素类型
    public static void test1(List<? extends Number> dest, List<? extends Number> src) {

    }

    //可以进行多重限定
    public static <T extends List & Collection> void test2(T t) {

    }

    //可以进行多重限定
    public static <T extends Queue & List> void test3(T t) {

    }

    //可以进行多重限定
    public static <T extends Collection & List> void test4(T t) {

    }

    //编译报错，无法进行多重限定
//    public static <? extends List & Collection> void test4(List<T> dest, List<T> src){
//
//    }

}

