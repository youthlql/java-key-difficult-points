package cn.imlql.keyAndDifficultPoints.principle;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/16 23:01
 * <p>
 * 功能描述:
 */
public class Test_principle02 {
    public static void main(String[] args) {
    }
}

class Test_Generic<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}