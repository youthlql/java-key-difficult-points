package cn.imlql.keyAndDifficultPoints.Generic;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 20:25
 * <p>
 * 功能描述:
 */
public class Test_GenericMethod02 {
    public static void main(String[] args) {
        print("123",753,123.12);
    }


    //必须是三个点
    public static <T> void print(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }
}
