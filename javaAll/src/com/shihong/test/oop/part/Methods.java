package com.shihong.test.oop.part;

/**
 * @author shihong on 2020/8/28.
 *	类的成员之二	方法
 */
public class Methods {

	/*
	类的成员之二	方法
			递归：就是一个方法中调用它自身
			public void say2(int a){
				if (a==50) {
				return;
				}
				System.out.println(a);

				a--;
				say2(a);
			}
		语法格式：

		修饰符 返回值类型 方法名 ( 参数列表) {
			方法体语句；
		}
		说明： 修饰符：public, private, protected等。
		返回值类型：return语句传递返回值。没有返回值：void。

		举例：
		public class Person{
			private int age;
			public int getAge()  { return age; } //声明方法getAge
				public void setAge(int i) {	//声明方法setAge
				age = i;	//将参数i的值赋给类的成员变量age
			}
		}
	 方法：
        a) 概念和好处
            a)   方法的概念 ：  用于封装类的特定行为和功能的代码块称为方法（函数）
                a)    用于封装一个功能的具体实现， 隐藏实现细节，
                b)   我们只需要考虑方法名和功能（干什么的）即可。
            b) java中的方法的概念
                a)    定义在类中用于描述 一个类的功能或行为
                b)   每一个功能或行为封闭了具体的实现细节
            c) 好处：
                a)    隐藏了实现细节，调用方法只需要知道方法名和功
                能即可 调用方便，而且安全
                b)   提高了代码的重用性


        方法的定义的语法，（相关要素）
            修饰符	返回类型	方法名  （参数。。。）{
                方法体
                return;
            }
        其中修饰符可以省略（根据需要） 返回类型可以是任何类型，包含基本类型或引用类型 方法可以没有返回值； 如果方法有返回值，
        要写成返回值的类型与方法声明相对应或兼容 一个方法最多有一个返回值


        方法名：
            a)    就是一个功能的标识，可以通过 调用方法名，执行里面具体的方法体
            b)   方法名真名规则和规范与变量真名规则规范一样 ，如  xxxYyyZzz;
            a)    遵循驼峰 命名法，一般是动词；


        参数类型可以为任意类型，包含基本类型或引用类型
            a)参数 可以为多个
            b)语法：
                （参数类型   名   ， 参数 类型   名  ，。。。）
            c)有的方法的执行需要调用方传递一些数据 ， 这些数据称为参数 ，
                参数 可以有，也可以没有，根据 需要使用
            d)方法体：
                方法具体的执行过程，即逻辑语句

        方法的调用
            1， 返回值类型  变量名 = 类名（或对象）.方法名（实参1，实参2...）
            2， 实参与形参的个数和顺序必须一致
            3， 如果方法没有参数，就不用传实参
            4， 如果方法没有返回值，就不用接收
            5， 本类调用方法，可以不用对象的方式调用，而是直接调用

        方法的参数传递-->按值传递（数据具体值，或，地址值）
            1,参数如果是基本类型，实参向形参传递的是值，形参的改变不改变实参
            2,参数如果是引用类型，实参向形参传递的是地址值，形参的改变会改变实参的内容跟着改变，
            因为它改变的是内存中地址指向的实际数据

        方法的重载
            在同一个类中方法名相同，参数列表不同
            同一个类中方法名相同，参数个数不同，或参数类型不同或参数顺序不同都叫方法的重载
               （方法的重载与返回类型无关，只与形参有关）

    * */

	/*
	可变参数
		修饰符	返回类型	方法名（ 类型。。。名）{
		返回值;    注：名相当 一个数组；
		}
	 好处：相当于有很多个形参参数，方便调用，提高代码的利用性；
	 当方法中有可变参数 和其它普通参数时，需要将可变参数放在最后
	 可变参数只能是统一的类型，
	 一个方法中只能有一个可变参数且放在参数列表的最后
	*/
	public void enableParm(String ...name){
		//name 为可变参数，相当于一个数组
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}

}