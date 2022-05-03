package cn.imlql.keyAndDifficultPoints.Generic;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 17:19
 * <p>
 * 功能描述:
 */
public class Test_GenericInterface {
}

interface Info<T> {        // 在接口上定义泛型
    public T getVar(); // 定义抽象方法，抽象方法的返回值就是泛型类型
}

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class InfoImpl<T> implements Info<T>
 * 如果不声明泛型，如：class InfoImpl implements Info<T>，编译器会报错："Unknown class"
 */
class InfoImpl<T> implements Info<T> {   // 定义泛型接口的子类
    private T var;

    public InfoImpl(T var) {
        this.setVar(var);
    }

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }
}

/**
 * 传入泛型实参时：
 * 定义一个是先烈实现这个接口,虽然我们只创建了一个泛型接口Info<T>
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * 即：InfoImpl01<T>，public String getVar();中的的T都要替换成传入的String类型。
 */
class InfoImpl01 implements Info<String> {   // 定义泛型接口的子类
    private String var;

    public InfoImpl01(String var) {
        this.setVar(var);
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getVar() {
        return this.var;
    }
}