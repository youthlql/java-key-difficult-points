package cn.imlql.keyAndDifficultPoints.principle;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/16 22:40
 * <p>
 * 功能描述:
 */
public class Test_principle01 {


    @Test
    public void test() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("my");
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(123);
        System.out.println(stringList.getClass() == integerList.getClass());

    }

    @Test
    public void test01() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<Integer>();
        //这样调用add方法只能存储整形，因为泛型类型的实例为Integer
        list.add(1);
        //这样写编译就会报错
//        list.add("my");

        //通过反射的方式则可以存储String
        list.getClass().getMethod("add", Object.class).invoke(list, "my");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

