package cn.imlql.keyAndDifficultPoints.Generic;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 16:38
 * <p>
 * 功能描述:
 */
public class Test_GenericClass {
    public static void main(String[] args) {
        test01();
    }

    public static void test() {
        /**
         * 1、泛型的类型参数只能是类类型（包括自定义类），不能是简单数据类型（比如int,long这些）
         * 2、传入的实参类型需与泛型的类型参数类型相同，即为这里的Integer。
         * 3、new 后面的泛型参数可以省略
         */
        Generic<Integer> genericInteger1 = new Generic<Integer>(123);
        Generic<Integer> genericInteger = new Generic<>(123);

        Generic<String> genericString = new Generic<String>("my");

        System.out.println(genericInteger.getVar());
        System.out.println(genericString.getVar());
    }

    public static void test01() {
        Generic generic = new Generic("我是字符串");
        Generic generic1 = new Generic(123);
        Generic generic2 = new Generic(123.123);
        Generic generic3 = new Generic(false);

        System.out.println(generic.getVar());
        System.out.println(generic1.getVar());
        System.out.println(generic2.getVar());
        System.out.println(generic3.getVar());
    }


}

/**
 * 1、此处T虽然可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
 * 但是为了代码的可读性一般来说：
 * K,V用来表示键值对
 * E是Element的缩写，常用来遍历时表示
 * T就是Type的缩写，常用在普通泛型类上
 * 2、还有一些不常见的U,R啥的
 */
class Generic<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T var;

    public Generic(T var) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.var = var;
    }

    public T getVar() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return var;
    }
}

class MyMap<K, V> {       // 此处指定了两个泛型类型
    private K key;     // 此变量的类型由外部决定
    private V value;   // 此变量的类型由外部决定

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
};