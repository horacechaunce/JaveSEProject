package com.shihong.test.object;


/**
 * @author shihong on 2019/4/21.
 *         构造函数和static关键字
 */

public class ConstructorAndKeyword {
    /**
     * 构造函数：
     * 创建对象时调用的函数，作用是给对象初始化，对象必须通过构造函数来进行初始化
     * <p>
     * 一个类中会有一个默认的空参数的构造函数，当在类中显式的定义构造函数时，那么类中的默认构造函数就没有了
     * <p>
     * 构造函数和一般函数的区别：
     * 构造函数：在对象创建时，调用对应的函数，给对象初始化使用，初始化时只可以调用一次
     * 一般函数：在对象创建后，需要函数功能时，被所属对象调用，可以被多次调用
     * <p>
     * 当成员变量和局部变量重名时我们可以使用this来区分
     * <p>
     * static（静态变更，类变量） 的特点：
     *      它是一个修饰符，用于修饰成员
     *      static修改的成员被据对象所共享，优先于对象存在，随着类的加载而存在，随着类的销毁而销毁，
     *      多了一种调用方式，可以通过类名.成员的方式调用
     * <p>
     * 成员变量和静态变量的区别:
     *      1,两个变量的生命同期不同
     *          成员变量随着对象的创建而存在，随着对象的销亡而销亡
     *          随着类的加载而存在，随着类的销毁而销毁
     *      2，调用方式不同
     *          成员变量只能被对象调用
     *          静态变量可以被对象调用，还可以被类名调用
     *      3，别名不同
     *          成员变量又称实例变量
     *          静态变量又称类变量
     *      4，存储位置不同
     *          成员变量数据存储在堆内存的对象中，所以也叫对象的特有数据
     *          静态变量数据存储在方法区（的静态区），所以也叫对象的共享数据
     */
    private String name;
    private int age;

    private static String contory = "CN";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContory() {
        return contory;
    }

    public void setContory(String contory) {
        this.contory = contory;
    }

    public static void show() {
        System.out.println(":" + contory);
    }

    public static void main(String[] args) {
        ConstructorAndKeyword constructor = new ConstructorAndKeyword();
        constructor.setName("小强");
        contory = "US";
        constructor.show();
        System.out.println("args = [" + args[0] + "]");
    }
}
