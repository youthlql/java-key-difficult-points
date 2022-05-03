package cn.imlql.keyAndDifficultPoints.principle;

import java.util.Collection;
import java.util.List;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/16 23:12
 * <p>
 * 功能描述:
 */
public class Test_principle03 {
    public static void main(String[] args) {
        System.out.println("哈哈");
    }
}

class Test_Generic1<T extends Collection & List> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}