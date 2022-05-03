package cn.imlql.keyAndDifficultPoints.principle;

import java.util.*;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/16 23:30
 * <p>
 * 功能描述:
 */
public class Test_principle04 {

    public static void main(String[] args) {


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

class Test {
    public static void main(String[] args) {
        //不指定泛型的时候
        int a1 = add(1, 2); //这两个参数都是Integer，所以T为Integer类型
        Number b1 = add(1, 1.2);//这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Number
        Object c1 = add(1, "my");//这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Object

        //指定泛型的时候
        int a = Test.<Integer>add(1, 2);//指定了Integer，所以只能为Integer类型或者其子类
//        int b = Test.<Integer>add(1, 2.2);//编译错误，指定了Integer，不能为Float
        Number c = Test.<Number>add(1, 2.2); //指定为Number，所以可以为Integer和Float
    }

    //这是一个简单的泛型方法
    public static <T> T add(T x, T y) {
        return x;
    }
}