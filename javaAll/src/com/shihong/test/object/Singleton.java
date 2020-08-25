package com.shihong.test.object;

/**
 * @author shihong on 2019/5/3.
 * 单例设计模式 饿汉式
 */
/*public class Singleton {
    private static final Singleton single = new Singleton(); //加final防止被子类属性覆盖

    private Singleton() {}

    public static Singleton getInstance() {
        return single;
    }
}*/

/**
 * //这种写法仍然使用JVM本身机制保证了线程安全问题；
 *  由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，
 *  因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
 * public class Singleton {
 *
 *    //这里使用私有内部类的方式使单例对象不能被外界访问，
 *    //其中static final这种写法仍然使用JVM本身机制保证了线程安全问题；
     private static class SingletonHolder {
         private static final Singleton INSTANCE = new Singleton();
     }
     private Singleton (){}

     public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
     }
    }
 */

/**
 * 单例模式，懒汉式
 * 在开发实际使用中，使用饿汉式比较多。因为懒汉式存在线程问题
 */
public class Singleton {
    private static Singleton single = null;

    private Singleton() {
    }

  /*  //同步函数的方式
    public static synchronized Singleton getInstance() {
        if (single == null)
            single = new Singleton();

        return single;
    }*/

    //同步代码块加锁的方式 安全高效
    public static Singleton getInstanceBlock() {
        if (single == null) {
            synchronized (Singleton.class) { //同步线程
                if (single == null) {
                    single = new Singleton();
                }
            }
        }
        return single;
    }
}
