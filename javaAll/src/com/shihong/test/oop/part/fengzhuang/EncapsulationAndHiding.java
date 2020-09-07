package com.shihong.test.oop.part.fengzhuang;

/**
 * @author shihong on 2020/8/28.
 * 封装和隐藏
 */
public class EncapsulationAndHiding {

	/*

		封装和隐藏：（对类中的成员进行隐藏然后再提供setter\getter方法进行成员变量的设置与访问）
			Java中通过将数据声明为私有的(private)，再提供公共的（public）方法:getXxx()和
			setXxx()实现对该属性的操作，以实现下述目的：
				隐藏一个类中不需要对外提供的实现细节；
				使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，限制 对属性的不合理操作；
				便于修改，增强代码的可维护性；

		访问权限  与 构造器
			四种访问权限修饰符：
				修饰符			类内部		同一个包		子类		任何地方
				private			yes
				default			yes			yes
				protected		yes			yes			yes
				public			yes			yes			yes		yes

			对于类Calss的修饰只能使用public和default
			public类可以在任何地方被访问
			default类只可以被同一个包内的类访问
	*/

}
