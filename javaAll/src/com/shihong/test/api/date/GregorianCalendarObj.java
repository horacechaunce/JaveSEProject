package com.shihong.test.api.date;

/**
 * @author shihong on 2020/9/15.
 * 日历类的实现类
 */
public class GregorianCalendarObj {
	/**
	 * java中主要有两个日历类，其一抽象类java.util.Calendar，其二java.util.GregorianCalendar类（标准阳历）。
	 * Calendar类和GregorianCalendar类是父子关系。GregorianCalendar类继承自Calendar类，是Calendar类的一个实现类，
	 * 提供了世界上大多数国家/地区的标准日历系统，是Calendar提供的一个实现标准阳历的具体工具。

	 实例对象

	 GregorianCalendar类用默认的地区和时区的当前日期和时间初始化对象，提供了如下构造函数。

	 //初始化默认当前时刻的实例对象
	 Calendar ca = new GregorianCalendar();

	 //初始化具有指定日期设置的实例对象
	 Calendar ca=new GregorianCanlendar(int year,int month,int date);
	 Calendar ca=new GregorianCanlendar(int year,int month,int date,int hour,int minute);
	 Calendar ca=new GregorianCanlendar(int year,int month,int date,int hour,int minute,int second);
	 GregorianCalendar实例对象的用法主要继承自父类Calendar。

	 //默认当前时间
	 //Thu Sep 05 15:23:06 CST 2019
	 Calendar ca = new GregorianCalendar();
	 System.out.println(ca.getTime());
	 //Fri Feb 01 00:00:00 CST 2019
	 Calendar ca = new GregorianCalendar(2019,1,1);
	 System.out.println(ca.getTime());
	 //Fri Feb 01 01:01:00 CST 2019
	 Calendar ca = new GregorianCalendar(2019,1,1,1,1);
	 System.out.println(ca.getTime());

	 */
}
