package com.shihong.test.oop.part.base;

/**
 * @author shihong on 2020/8/31.
 * object类的介绍
 */
public class Object {
	/*
	*
	*	1,Object类是所有Java类的根父类
	*		如果在类的声明中未使用extends关键字指明其父类，则默认父类为Object类
	*
	*		Object	类中的主要方法
		*		NO.	 方法名称									类型			描述
				1	 public Object()							构造			构造方法
				2	 public boolean equals(Object obj)			普通			对象比较
				3	 public int hashCode()						普通			取得Hash码
				4	 public String toString()					普通			对象打印时调用

			基本类型比较值:只要两个变量的值相等，即为true.
				a)   int a=5; if(a==6){…}  //false
			引用类型比较引用(是否指向同一个对象):只有指向同一个对象时，==才返回true. (引用类型比较使用==判断地址值是否相等	)
				Person p1=new Person();
				Person p2=new Person();
				if (p1==p2){…}	//false
			用“==”进行比较时，符号两边的数据类型必须兼容(可自动转换的基本数据类 型除外)，否则编译出错；

	   2,equals()：
				所有类都继承了Object，也就获得了equals()方法。这个方法在需要特定条件的时候可以重写。
			此方法在object类中底层最终使用的是==进行比较，所以如果需要的情况可以重写
			（大多实现都是用此方法来重写对内容进行比较的方式）
			只能比较引用类型，此方法在object类中其作用与“==”相同,比较是否指向同一个对象。

			格式:obj1.equals(obj2)

			特例：当用equals()方法进行比较时，对类File、String、Date及包装类（Wrapper Class）来说，
			是比较类型及内容而不考虑引用的是否是同一个对象；
				原因：在这些类中重写了Object类的equals()方法。

		3,toString()：
			方法在Object类中定义，其返回值是String类型，返回类名和它的哈希码值的十六进制形式。
			在进行String与其它类型数据的连接操作时，自动调用toString()方法
				Date now=new Date();
				System.out.println(“now=”+now);   相当于 System.out.println(“now=”+now.toString());
			可以根据需要在用户自定义类型中重写toString()方法
				如String 类重写了toString()方法，返回字符串的值。
				s1=“hello”
				System.out.println(s1);//相当于System.out.println(s1.toString());

			基本类型数据转换为String类型时，调用了对应包装类的toString()方法
				int a=10;  System.out.println(“a=”+a);

		4, ==运算符
			比较基本数据类型，比较两个基本数据类型的 “值” 是否相等
			引用数据类型：	比较两个引用数据类型的 “地址值” 是否相等

			public boolean equals(Object obj){} 比较两个对象是否相等
				此方法在object类中
				只能比较两上引用数据类型
				object类中的equals方法比较的是 地址值 （通过查看源码发现是使用 == 完成的）
				如果object类中的equals方法对我们不适用，可以重写


	*/

}
