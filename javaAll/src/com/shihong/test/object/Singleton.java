package com.shihong.test.object;

/**
 * @author shihong on 2019/5/3.
 * 单例设计模式 饿汉式
 */
/*public class Singleton {
    private static Singleton single = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return single;
    }
}*/

/**    
 * 单例模式，懒汉式
 * 在开发实际使用中，使用饿汉式比较多。因为懒汉式存在线程问题
 */
public class Singleton {
    private static Singleton single = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }
}
