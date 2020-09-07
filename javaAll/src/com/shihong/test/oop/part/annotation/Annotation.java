package com.shihong.test.oop.part.annotation;

/**
 * @author shihong on 2020/9/3.
 * 注解
 */
@SuppressWarnings("unused")
public class Annotation {
	/*
	 * 	注解：是jdk1.5后推出的新特性，它是一个元数据，是一个代码级别的说明
	 * 		元数据：指的是描述数据的数据
	 * 			比如 String name ="123"; 其中123是具体数据，name就是它的描述数据，即元数据
	 * 		在java当中是以 “@注解名” 的方式呈现的
	 *
	 * 	1，jdk内置的常用注解（3个）
	 * 		@Override：只能用在方法上，说明该方法必须是重写的方法
	 * 		@Deprecated： 用于属性，方法，类上 说明已经过期
	 * 			（一般在程序中发现某方法存在某些问题时使用，说明当前方法还能使用但是存在某种问题不建议后续使用的情况，
	 * 			这种情况不能删除该方法因为还有某些程序在调用，为不使用其他调用方受到影响所以用注解提示，并给出新的解决）
	 *		@SuppressWarnings: 抑制编译器警告
	 *
	 	2，自定义注解：
	 		声明方式，使用:　@Interface 如下例
				public @interface MyAnnotation{
					String name() default "默认值"; //使用default代表默认值，不指定default则使用注解时必须显示传值
				}
			注解声明后使用方式与@SuppressWarnings 一样;

		3，元注解：

			a)	Retention 用于指定注解的生命周期
			b)	Target	指定注解用于修饰哪些程序元素.
			c)	Documented	随之生成说明文档
			d)	Inherited  具有继承性


			详解如下：
			@Retention: 只能用于修饰一个 Annotation 定义, 用于指定该 Annotation 的生命周期
				 @Retention 包含一个  RetentionPolicy 类 型的成员变量, 使用  @Retention 时必须为该  value 成员变量指定值:
				 RetentionPolicy.SOURCE:   编译器直接丢弃这种策略的注释
				 RetentionPolicy.CLASS: 编译器将把注释记录在  class 文件中. 当 运行 Java 程序时,
				 JVM 不会保留注解。 这是默认值
				 RetentionPolicy.RUNTIME:编译器将把注释记录在  class 文件中. 当运行  Java 程序时, JVM 会保留注释.
				 程序可以通过反射获取该 注释

			@Target: 用于修饰 Annotation 定义, 用于指定声明的  Annotation 能用于修饰哪些程序元素.
				@Target 也包含一个名为  value 的成员变量.

			@Documented: 用于指定被该元注解 修饰的  Annotation 类随之生成说明文档
				定义为Documented的注解必须设置Retention值为RUNTIME。

			@Inherited: 被它修饰的  Annotation 将具有继承性.如果某个类使用了被
				@Inherited 修饰的  Annotation, 则其子类将自动具有该注解


	 *
	 */
}

