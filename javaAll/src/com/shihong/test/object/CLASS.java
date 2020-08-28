package com.shihong.test.object;

/**
 * @author shihong on 2019/4/20.
 */
public class CLASS {
 
/*
类的概念：
    用java语言对现实生活中的事物进行描述（即通过类的形式来体现的）
    描述的方式：属性（特征），行为

对象的概念：
    该类事物的实实在在存在的个体
    （万物皆对象，在java中具有一类特定功能的具体个体实例就是一个对象，比如一台车，它具有除了颜色、款式等特征外，
    它还具有运行和裁人的功能，我们在使用中就是通过车这个对象来对它的运行和裁人的功能进行运用)

类与对象的关系
    类：对事物的描述
    对象：该类对象的实例

组成类的所有成员变量和成员函数
     成员变量和局部变量的区别：
        1，成员变量定义在类中，整个类都可以访问
           局部变量定义在函数、语句、局部代码块中，只有所属区域可以访问

        2，成员变量存在于堆内存的对象中
           局部变量存在于栈内存的方法中

        3，成员变量随着对象的创建而存在，随着对象的消失而消失
           局部变量随着所属区域的执行而存在，随着区域的结束而结束

        4，成员变量都有默认初始化值
           局部变量没有默认初始化值

私有方法的访问方式：
import java.lang.reflect.Method;


public class ReflectionTest {

    public static void main(String args[]) throws Exception{

        MyTest myTest = new MyTest();

        // 调用公共方法
        myTest.publicMethod("传入参数");

        // 获得类的私有方法
        Method method = MyTest.class.getDeclaredMethod("privateMethod",Object.class);
        // 开启私有访问权限
        method.setAccessible(true);
        method.invoke(myTest,"传入参数");

    }
}
*/


}
