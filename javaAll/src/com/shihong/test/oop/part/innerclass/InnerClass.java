package com.shihong.test.oop.part.innerclass;

import java.util.Comparator;

/**
 * @author shihong on 2020/9/1.
 *         内部类
 */
public class InnerClass {


	/*
	 *
	 *	类的成员之：内部类，属性，方法，构造器，代码块
	 *
	 * 	在 Java 中，可以将一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类
	 *
	 * 	四种内部类：
	 * 		成员内部类、局部内部类、匿名内部类和静态内部类
	 *
	 * 	1.成员内部类
	 *		成员内部类，在类中声明另一个类，里面的类“内部类”，外面的类“外部类”
	 		成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
	 			例：
				 class Circle {　//外部类
					 private double radius = 0;
					 public static int count =1;
					 public Circle(double radius) {
					 	this.radius = radius;
					 }

					 class Draw {     //内部类
						 public void drawSahpe() {
							 System.out.println(radius);  //外部类的private成员
							 System.out.println(count);   //外部类的静态成员
					 	}
					 }
				 }
	 		当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。
	 		如果要访问外部类的同名成员，需要以下面的形式进行访问：
				 外部类.this.成员变量
	 			 外部类.this.成员方法
	 		内部类可以使用四种访问修饰符（public,protected,default,private），外部类使用public和default修饰
	 		可以用static，final修饰
	 	2.局部内部类
	 		在方法中声明的类，就叫做局部内部类，只在当前方法中可用
	  		当某个类公适用于当前方法时考虑使用局部内部类


	 *
	 * 	3,匿名内部类：
	 * 		匿名内部类就是内部类的简写格式
	 * 		前提：
	 * 			内部类必须继承或实现一个外部类或者接口
	 * 		匿名内部类其实就是一个匿名子类对象
	 * 		格式：
	 * 			new 父类Or接口(){子类内容}
	 *		局部内部类访问同级别的局部变量的时候 ，局部变量要使用final修饰（jdk1.8后可以 不使用final修饰）
	 *
	 *
	 */

	//若某个类只适用于当前方法时 如下：
	public static Comparator getComparator() {
		//实现Comparator接口的匿名内部类
		class MyComparator implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
					return 0;
			}
		}
		return new MyComparator();
	}

	//或创建匿名局部内部类的方式如下：这里匿名内部默认类实现了接口（实现方式如上）
	public static Comparator getComparator1(){
		//匿名局部内部类
		Comparator com = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}
		};
		return com;
	}

	/*
		4.静态内部类
			静态内部类是不需要依赖于外部类的，这点和类的静态成员属性有点类似，
			并且它不能使用外部类的非static成员变量或者方法

		5. Inner class一般用在定义它的类或语句块之内，在外部引用它时必须给出完整的名称。
			a.  Inner class的名字不能与包含它的类名相同；

		6. Inner class可以使用外部类的私有数据，因为它是外部类的成员，同一个类的成员之间可 相互访问。
			而外部类要访问内部类中的成员需要:内部类.成员或者内部类对象.成员。

		7.	分类：
			a.  成员内部类（static成员内部类嵌套类和成员内部类）
			b.	局部内部类（不谈修饰符）、匿名内部类

		8.	内部类的特性：
			a)	Inner  class作为类的成员：
				a)	可以声明为final的
				b)	和外部类不同，Inner     class可声明为private或protected；
				c)  Inner class 可以声明为static的，但此时就不能再使用外层类的非static的成员变 量；
			b)	Inner class作为类：
				a) 可以声明为abstract类 ，因此可以被其它的内部类继承
			c)  【注意】非static的内部类中的成员不能声明为static的，只有在外部类或static的内部 类中才可声明static成员。


		9.	匿名内部类不能定义任何静态成员、方法和类，只能创建匿名内部类的一个实例。一个匿
			名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。

			i)     	new 父类构造器（实参列表）|实现接口(){
						//匿名内部类的类体部分
					}

		10.	内部类的访问特点：
			内部类可以直接访问外部类中的成员
			外部类要访问内部类必须建立内部类的对象

		11.	访问方式：
			直接访问外部类中的内部类中的成员
				Outer.Inner in = new Outter().new Inner();
				in.show()//访问内问类的成员
			如果内部类是静态的，成员是静态的
				Outer.Inner.function();
		12. 如果内部类中定义了静态成员，那么该内部类也必须是静态的

		13.	内部类的成员访问与对象的创建：
			public class A{
				private int s = 111;
				public class B {
					private int s = 222;

					public void mb(int s) {
						System.out.println(s);	// 局部变量s
						System.out.println(this.s);	// 内部类对象的属性s
						System.out.println(A.this.s); // 外层类对象属性s
					}
				}
				public static void main(String args[]){
					A a = new A();
					A.B b = a.new B();
					b.mb(333);
				}
			}

	 */

}

