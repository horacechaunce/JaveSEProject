package com.shihong.test.api.date;


/**
 * @author shihong on 2020/9/14.
 *         日历类
 */
public class CalendarObj {
	/*

			java.util.Calendar类是一个抽象类，是java日期处理的核心类之一。
			b)	获取Calendar实例的方法
				a)	使用Calendar.getInstance()方法
				b)	调用它的子类GregorianCalendar的构造器。

			Calendar类为操作日历字段，及其与特定瞬间之间的转换提供了方法。
			日历字段包含YEAR、MONTH、DAY_OF_MONTH、HOUR等，它们都是Calendar类的静态常量。



	/*
		一个Calendar的实例是系统时间的抽象表示，通过get(int  field)方
		法来取得想要的时间信息。比如
		YEAR、MONTH、DAY_OF_WEEK、HOUR_OF_DAY  、MINUTE、SEC
		OND
		a)	public void set(int field,int value)
		b)	public void add(int field,int amount)
		c)	public final Date getTime()
		d)	public final void setTime(Date date)
		Calendar calendar = Calendar.getInstance();
		// 从一个 Calendar 对象中获取 Date 对象
		Date date = calendar.getTime();
		//使用给定的 Date 设置此 Calendar 的时间
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		System.out.println("当前时间日设置为8后,时间是:" + calendar.getTime());
		calendar.add(Calendar.HOUR, 2);
		System.out.println("当前时间加2小时后,时间是:" + calendar.getTime());
		calendar.add(Calendar.MONTH, -2);
		System.out.println("当前日期减2个月后,时间是:" + calendar.getTime());



	 */






}
