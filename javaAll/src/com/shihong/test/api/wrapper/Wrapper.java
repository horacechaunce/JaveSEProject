package com.shihong.test.api.wrapper;

/**
 * @author shihong on 2020/9/4.
 * 包装类
 */
public class Wrapper {

	/*
		针对八种基本定义相应的引用类型—包装类（封装类）
		有了类的特点，就可以调用类中的方法。

			基本数据类型	包装类
			boolean		Boolean
			byte		Byte
			short		Short
			int			Integer
			long		Long
			char		Character
			float		Float
			double		Double

		 基本数据类型包装成包装类的实例	---装箱
			a) 通过包装类的构造器实现：
				a)	Integer t1 = new Integer(i); //手工装箱
				b)   Integer t2 = 500; //自动装箱
				c)   Integer t3  = Integer.valueOf(i)；

			b)   还可以通过字符串参数构造包装类对象：
				a)	Float f = new Float(“4.56”);
				b)	Long l = new Long(“asdf”); //NumberFormatException


		获得包装类对象中包装的基本类型变量	---拆箱
			a) 调用包装类的.xxxValue()方法：
				a)	boolean b = b.booleanValue();//手动拆箱
				b)	boolean n = b;//自动拆箱

		JDK1.5之后，支持自动装箱，自动拆箱。但类型必须匹配。
		字符串转换成基本数据类型
			a) 通过包装类的构造器实现：
				a)  Integer i = new Integer(“12”);
				b)	通过包装类的parseXxx(String s)静态方法：
					a)	Float f = Float.parseFloat(“12.1”);
				c) 使用对应包装类的静态方法valueOf(str);
					a) Integer i = Integer.valueOf("123");

		基本数据类型转换成字符串
			a)   调用字符串重载的valueOf()方法：
				a)   String str = String.valueOf(2.34f); //String类的静态方法valueOf();
					String str = Integer.toString(123); //包装类的静态方法toString();
					String intStr = 5 + "";

					a.   Integer t = new Integer(i);
					b.   装箱：包装类使得一个基本数据类型的数据变成了类。
					c.    有了类的特点，可以调用类中的方法。
					d.   String s = t.toString(); // s = “500“,t是类，有toString方法
					e.   String s1 = Integer.toString(314); // s1= “314“ 将数字转换成字符 串。
					f.	String s2=“4.56”;
					g.	double ds=Double.parseDouble(s2);  //将字符串转换成数字


		拆箱：将数字包装类中内容变为基本数据类型。
			a.   int j = t.intValue();   // j = 500，intValue取出包装类中的数据
			b.   包装类在实际开发中用的最多的在于字符串变为基本数据类 型。
			c.	String str1 = "30" ;
			d.	String str2 = "30.3" ;
			e.	int x = Integer.parseInt(str1) ;   // 将字符串变为int型
			f.	float f = Float.parseFloat(str2) ; // 将字符串变为int型


		对于装箱：
			如下代码是将int类型装箱为Integer类型值的valueOf方法源码
			 public static Integer valueOf(int i) {
				if (i >= IntegerCache.low && i <= IntegerCache.high)
					return IntegerCache.cache[i + (-IntegerCache.low)];
				return new Integer(i);
			}

    		由上面方法可以看出
    		Integer提供了一个小的缓存数组，该缓存的取值范围是-128 到 127之间，
    		若要装箱的值是这个范围内则在缓存中取Integer实例
    		如果装箱的数据超出这个范围则new新的Integer对象
    		因此例子如下：
    			Integer num1 = 123;
    			Integer num2 = 123;
    			num1 == num2  返回 true
				但是当
				Integer num1 = 130;
    			Integer num2 = 130;
    			num1 == num2  返回 false






	 *
	 */



}
