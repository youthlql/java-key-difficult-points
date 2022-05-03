package cn.imlql.keyAndDifficultPoints.Wildcard_Character;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/16 12:09
 * <p>
 * 功能描述: 泛型反射
 */
public class Test_Reflect {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        A a = createInstance(A.class);
        B b = createInstance(B.class);
    }

    /**
     * 这样写明显是要安全很多的
     */
    public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static void getA(String path) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        A a = (A) Class.forName("keyAndDifficultPoints.Wildcard_Character.A").newInstance();
        //很明显下面的这行代码是错的，但是写代码的时候你不知道path是哪个
//        B b = (B)Class.forName("keyAndDifficultPoints.Wildcard_Character.A").newInstance();
        System.out.println(a.toString());
    }
}

class A {
    String name;

    @Override
    public String toString() {
        return "我是对象A";
    }
}

class B {
    String name;

    @Override
    public String toString() {
        return "我是对象B";
    }
}


class C {
    //所以当不知道声明什么类型的 Class 的时候可以定义一 个Class<?>。
    public Class<?> clazz1;

    //因为T没有声明，所以编译报错
//    public Class<T> clazz2;
}

class D<T> {
    public Class<?> clazz;
    // 不会报错
    public Class<T> clazzT;
}
