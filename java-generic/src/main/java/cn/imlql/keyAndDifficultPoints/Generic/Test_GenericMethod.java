package cn.imlql.keyAndDifficultPoints.Generic;


/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 17:46
 * <p>
 * 功能描述:
 */
public class Test_GenericMethod {

    public static void main(String[] args) {
        Test_GenericMethod test_genericMethod = new Test_GenericMethod();
        Generic01<Integer> generic01 = new Generic01<>(123);

        Generic01<String> generic02 = new Generic01<>("AAAAA");

        test_genericMethod.genericMethod_test01(generic01);
        test_genericMethod.genericMethod_test02(generic02, "我是T");

        test_genericMethod.Method01(generic01);
    }

    /**
     * 说明：
     * 1、public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     * 2、只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     * 3、<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     * 4、<T> 后面的这个T，代表这个方法的返回值类型
     * 4、与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     */
    public <T> T genericMethod(T a) {

        return a;
    }


    /**
     * 1、这才是一个真正的泛型方法。
     * 2、首先在public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T。
     * 3、这个T可以出现在这个泛型方法的任意位置.泛型的数量也可以为任意多个
     */
    public <T> T genericMethod_test01(Generic01<T> generic01) {
        System.out.println("我是genericMethod_test01：" + generic01.getKey());
        T test = generic01.getKey();
        return test;
    }

    public <T, V> T genericMethod_test02(Generic01<T> generic01, V value) {
        System.out.println("我是genericMethod_test02：" + generic01.getKey() + "==> value：" + value);

        T test = generic01.getKey();
        return test;
    }


    //这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
    public void Method01(Generic01<? extends Number> generic01) {
        System.out.println(generic01.getKey());
    }


    //这也不是一个泛型方法，这也是一个普通的方法，只不过使用了泛型通配符?
    //同时这也印证了泛型通配符章节所描述的，?是一种类型实参，可以看做为Number等所有类的父类
    public void Method02(Generic01<?> generic01) {
        System.out.println(generic01.getKey());
    }

    /**
     * 这个方法是有问题的，编译器会为我们提示错误信息："UnKnown class 'E' "
     * 虽然我们声明了<T>,也表明了这是一个可以处理泛型的类型的泛型方法。
     * 但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
     */
//    public <T> T showKeyName(Generic01<E> generic01, T t) {
//        return t;
//    }

}

class Generic01<T> {
    private T key;

    public Generic01(T key) {
        this.key = key;
    }


    /**
     * 1、这个虽然在方法中使用了泛型，但这并不是一个泛型方法。这只是类中一个普通的
     * 成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。所以在这个方法中才
     * 可以继续使用 T 这个泛型。
     */
    public T getKey() {
        return key;
    }

    /**
     * 1、这个方法显然是有问题的，在编译器会给我们提示这样的错误信息"cannot reslove symbol E"
     * 因为在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别。
     */
//    public E setKey(E key) {
//        this.key = key;
//    }

}

