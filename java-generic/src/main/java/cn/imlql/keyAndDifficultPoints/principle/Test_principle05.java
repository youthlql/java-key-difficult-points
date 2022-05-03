package cn.imlql.keyAndDifficultPoints.principle;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/17 16:20
 * <p>
 * 功能描述:
 */
public class Test_principle05 {
    public static void main(String[] args) {
    }
}

class Generic<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}



