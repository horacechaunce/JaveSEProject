package com.shihong.test.oop.part.duotai;

/**
 * @author shihong on 2020/8/31.
 *         对象的类型转换
 */
public class TypeConversion {

	/*
	*
		a)	x instanceof A：检验x是否为类A的对象，返回值为boolean型。
		b)  要求x所属的类与类A必须是子类和父类的关系，否则编译错误。
		c)   如果x属于类A的子类B，x instanceof A值也为true。
		d)	public class Person extends Object {…}
		e)	public class Student extends Person {…}
		f)	public class Graduate extends Person {…}
		g) -------------------------------------------------------------------
		h)	public void method1(Person e) {
		a)	if (e instanceof Person)
		a)     // 处理Person类及其子类对象
		b)	if (e instanceof Student)
		a)   //处理Student类及其子类对象
		c)	if (e instanceof Graduate)
		a)   //处理Graduate类及其子类对象
		i)	}




		•  基本数据类型的Casting：
			•  自动类型转换：小的数据类型可以自动转换成大的数据类型 如long g=20;	double d=12.0f
			•  强制类型转换：可以把大的数据类型强制转换(casting)成小的数据类型
		如 float f=(float)12.0;  int a=(int)1200L

		• 对Java对象的强制类型转换称为造型
			从子类到父类的类型可以自动进行

		• 对Java对象的强制类型转换称为造型
			• 从子类到父类的类型可以自动进行
			• 从父类到子类的类型转换必须通过造型(强制类型转换)实现
			• 无继承关系的引用类型间的转换是非法的
			• 在造型前可以使用instanceof操作符测试一个对象的类型

*/
}
