package cn.imlql.keyAndDifficultPoints.Wildcard_Character;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: youthlql-吕
 * @Date: 2020/10/15 21:25
 * <p>
 * 功能描述: 泛型通配符测试
 */
public class Test_Wildcard_Character {

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        test(dogList);
//        test1(dogList);
    }

    static void test(List<? extends Animal> animals) {
        System.out.println("test输出:");
        for (Animal animal : animals) {
            System.out.print(animal.toString() + "-");
        }
    }

    static void test1(List<Animal> animals) {
        System.out.println("test1输出:");
        for (Animal animal : animals) {
            System.out.print(animal.toString() + "-");
        }
    }


}

class Animal {
    @Override
    public String toString() {
        return "Animal";
    }
}

class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog";
    }
}