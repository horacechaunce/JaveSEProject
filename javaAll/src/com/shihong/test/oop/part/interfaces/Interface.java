package com.shihong.test.oop.part.interfaces;

/**
 * @author shihong on 2020/9/1.
 * 接口的介绍
 */
public class Interface {
	/*
			接口： 可以定义多个不相关事物的相同功能

			如何使用接口：
			 	接口与类是平级的，使用关键字：interface 定义

			接口可以理解 特殊 的 抽象 类，因为接口中只能定义“全局静态常量”和“抽象方法”

			接口中不能有变量，一般方法，构造器，代码块，接口中不能创建实例

			接口就是用来被实现的,使用关键字 implements

			使用接口的优点：
				解决了java中单继承的局限性
				接口只能继承接口，可以多继承（继承多个接口）
				一个类可以继承一个类，同时实现多个接口
				接口中所有方法均为抽象方法

			接口的用途：
				用来定义现实世界不同类型事物的共同行为特征。

			例如：
				a) 飞行特征（包括起飞，飞行、着陆等行为）是鸟和飞机所共有的。
				b) 鸟和飞机可定义为具体类
				c) 它们的共同行为特征可被定义在接口中

			接口可以包含以下成员：
				a) 属性
					a) 接口中的所有属性均被视静态常量。例如，下面几种方式的声明是等效 的：
					b)	int num = 10;
					c)	public int num = 10;
					d)	public static final int num = 10;
				b) 抽象方法
					a)  接口中所有方法均为抽象方法。例如，下面两种方式的声明是等效的：
					b)	public abstract void takeoff();
					c)	public void takeoff();


			一个类可以实现多个接口，
				b)  接口不能实例化
				c)      具体类（子类）可以实现接口（父类），并实现接口中的抽象方法（必须实现）
				d)	class SubClass implements InterfaceA{ }
				e)  具体类适用父接口的多态


			具体类可以实现多个接口
			实现接口的类中必须提供接口中所有方法的具体实现内容，方可实例化。否则，仍为 抽象类。

			接口的主要用途就是被实现类实现。（面向接口编程）

			一个类可以同时继承父类并实现接口
			一个类可以实现多个无关的接口

			与继承关系类似，接口与实现类之间存在多态性

			如果实现接口的类中没有实现接口中的全部方法，必须将此类定义为抽象类

			接口也可以继承另一个接口，使用extends关键字。
			实现类SubAdapter必须给出接口SubInterface以及父接口MyInterface中所有方法的实 现。

			接口的特点：
				a)	用interface来定义。
				b)	接口中的所有成员变量都默认是由public static final修饰的。
				c)	接口中的所有方法都默认是由public abstract修饰的。
				d)	接口没有构造器。
				接口采用多继承机制。


			接口方法总结
				a) 通过接口可以实现不相关类的相同行为，而不需要考虑这些类之间的层次关系。
				b) 通过接口可以指明多个类需要实现的方法，一般用于定义对象的扩张功能。
				c) 接口主要用来定义规范。解除耦合关系。


			接口和抽象类的关系
			-------------------------------------------------------------------------------------------------------------
			|	No.		区别点			|	抽象类							接口
			-------------------------------------------------------------------------------------------------------------
			|	1		定义				|	可以包含抽象方法的类				全部是抽象方法和全局常量的集合
			-------------------------------------------------------------------------------------------------------------
			|	2		组成				|	构造方法、抽象方法、普通方法、		常量、抽象方法
			|							|	常量、变量
			-------------------------------------------------------------------------------------------------------------
			|	3		使用				|	子类继承抽象类(extends)			子类实现接口(implements)
			-------------------------------------------------------------------------------------------------------------
			|	4		关系				|	抽象类可以实现多个接口				接口不能继承抽象类，但允许继承多个接口
			-------------------------------------------------------------------------------------------------------------
			|	5		常见设计模式		|	模板设计							工厂设计、代理设计
			-------------------------------------------------------------------------------------------------------------
			|	6		对象				|	都通过对象的多态性产生实例化对		都通过对象的多态性产生实例化对
			-------------------------------------------------------------------------------------------------------------
			|	7		局限				|	抽象类有单继承的局限				接口没有此局限
			-------------------------------------------------------------------------------------------------------------
			|	8		实际				|	作为一个模板						是作为一个标准或是表示一种能力
			-------------------------------------------------------------------------------------------------------------
			|	9		选择				|	如果抽象类和接口都可以使用的话，
			|							|	优先使用接口，因为避免单继承的局限
			-------------------------------------------------------------------------------------------------------------
			|	10		特殊				|	一个抽象类中可以包含多个接口，
			|							|	一个接口中可以包含多个抽象方法
			-------------------------------------------------------------------------------------------------------------











	 */
}
