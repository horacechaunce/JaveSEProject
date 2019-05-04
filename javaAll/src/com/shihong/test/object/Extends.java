package com.shihong.test.object;

/**
 * @author shihong on 2019/5/4.
 *         类的继承
 */
public class Extends {

    /**
     * 1，子类和父类的关系是 is a 的关系 （所属关系）
     * 2，java只提供单继承，但可以多层继承
     *
     *
     * 　1.子类继承父类的成员变量
     *
     *　　当子类继承了某个类之后，便可以使用父类中的成员变量，但是并不是完全继承父类的所有成员变量。具体的原则如下：

     *　 1）能够继承父类的public和protected成员变量；不能够继承父类的private成员变量；

     　　2）对于父类的包访问权限成员变量，如果子类和父类在同一个包下，则子类能够继承；否则，子类不能够继承；

     　　3）对于子类可以继承的父类成员变量，如果在子类中出现了同名称的成员变量，则会发生隐藏现象，
            即子类的成员变量会屏蔽掉父类的同名成员变量。如果要在子类中访问父类中同名成员变量，需要使用super关键字来进行引用。

     　　2.子类继承父类的方法

     　　同样地，子类也并不是完全继承父类的所有方法。

     　　1）能够继承父类的public和protected成员方法；不能够继承父类的private成员方法；

     　　2）对于父类的包访问权限成员方法，如果子类和父类在同一个包下，则子类能够继承；否则，子类不能够继承；

     　　3）对于子类可以继承的父类成员方法，如果在子类中出现了同名称的成员方法，则称为覆盖，
            即子类的成员方法会覆盖掉父类的同名成员方法。如果要在子类中访问父类中同名成员方法，需要使用super关键字来进行引用。

     　　注意：隐藏和覆盖是不同的。隐藏是针对成员变量和静态方法的，而覆盖是针对普通方法的。
     */

    /**
     * 重载和重写的区别
     *
     *    方法的重写规则
             参数列表必须完全与被重写方法的相同；
             返回类型必须完全与被重写方法的返回类型相同；
             访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected。
             父类的成员方法只能被它的子类重写。
             声明为final的方法不能被重写。
             声明为static的方法不能被重写，但是能够被再次声明。
             子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法。
             子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法。
             重写的方法能够抛出任何非强制异常，子类抛出的异常范围必须大于等于父类抛出的异常范围
             构造方法不能被重写。
             如果不能继承一个方法，则不能重写这个方法。

        重载(Overload)
             重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
             每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
             只能重载构造函数

        重载规则
             被重载的方法必须改变参数列表(参数个数或类型或顺序不一样)；
             被重载的方法可以改变返回类型；
             被重载的方法可以改变访问修饰符；
             被重载的方法可以声明新的或更广的检查异常；
             方法能够在同一个类中或者在一个子类中被重载。
             无法以返回值类型作为重载函数的区分标准
     */


}
/*
 以下是一个练习题 ，考点是继承时对象加载过程，运行结果是
    shape draw constructor
    shape constructor
    circle draw constructor
    circle constructor
 出现这样的结果是因为在类加载过程中，如下面标注的数字顺序


class Test {

    public static void main(String[] args)  {
        new Circle(); //开始调用 1
    }
}

class Draw {

    public Draw(String type) {
        super(); //调用父类无参 5  再次被调用 10
        System.out.println(type+" draw constructor"); // 输出  6 输出 11
    }
}

class Shape {
    private Draw draw = new Draw("shape"); //加载成员,调用Draw(type) 4
    private String s = null;   // 加载成员 ， 7

    public Shape(){
        super(); //无参构造运行后，加载它的成员 3   第7步完成后返回到这里
        System.out.println("shape constructor"); //输出  8
    }
}

class Circle extends Shape {
    private Draw draw = new Draw("circle"); //加载成员，调用new Draw("circle")  9  调用完成后返回这里继续

    public Circle() {
        super();  //先运行它的父类无参构造 2  第8步完成后返回到这里后加载这个类的成员
        System.out.println("circle constructor");  //输出 12
    }
}
*/
