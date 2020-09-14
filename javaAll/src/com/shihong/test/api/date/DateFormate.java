package com.shihong.test.api.date;

/**
 * @author shihong on 2020/9/14.
 * 日期类及格式化
 */
public class DateFormate {
	/*
		a)	1.java.lang.System类
			b)	System类提供的public static long currentTimeMillis()用来返回当前时间 与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
				a) 此方法适于计算时间差。
			c) 计算世界时间的主要标准有：
				a)	UTC(Universal Time Coordinated)
				b)	GMT(Greenwich Mean Time)
				c)	CST(Central Standard Time)

		b)	java.util.Date类
			a)	表示特定的瞬间，精确到毫秒
			b) 构造方法：
			c)	Date()使用Date类的无参数构造方法创建的对象可以获取本地当 前时间。
			d)	Date(long date)

			e) 常用方法
				f)	getTime():返回自 1970 年  1 月  1 日  00:00:00 GMT 以来此 Date对象表示的毫秒数。
				g)	toString():把此 Date 对象转换为以下形式的 String：  dow mon dd hh:mm:ss zzz yyyy
					其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)，zzz是时间标准
				e)	Date类的API不易于国际化，大部分被废弃了，java.text.Simp
					leDateFormat类是一个不与语言环境有关的方式来格式化和解析日期 的具体类。
					它允许进行格式化（日期à文本）、解析（文本à日期）

			h) 格式化：
				i)	SimpleDateFormat() ：默认的模式和语言环境创建对象
				j)	public SimpleDateFormat(String pattern)：该构造方法可以用参数
					pattern指定的格式创建一个对象，该对象调用：
				k)	public String format(Date date)：方法格式化时间对象date

			l) 解析：
				m)	public Date parse(String source)：从给定字符串的开始解析文本，以生 成一个日期。
				Date date = new Date(); //产生一个Date实例
				//产生一个formater格式化的实例
				SimpleDateFormat formater = new SimpleDateFormat();
				System.out.println(formater.format(date));//打印输出默认的

			格式
				SimpleDateFormat formater2 = new SimpleDateFormat( "yyyy年MM月dd日 EEE HH:mm:ss");
				System.out.println(formater2.format(date));
				//实例化一个指定的格式对象
				//按指定的格式输出
				try {
					Date date2 = formater2.parse(“2008年08月08日 星期一 08:08:08");
					//将指定的日期解析后格式化按指定的格式输出
					System.out.println(date2.toString());
				} catch (ParseException e) {
					e.printStackTrace();
				}

			日期格式化对象字母表：

				字母  	日期或时间分量  			展示（描述）  			示例
				G  		Era designator  		Text  					AD
				y  		Year  					Year  					1996; 96
				Y  		Week year  				Year 					2009; 09
				M  		Month in year 			Month  					July; Jul; 07
				L  		Month in year 			Month  					July; Jul; 07
				w		Week in year  			Number  				27
				W		Week in month  			Number  				2
				D		Day in year  			Number  				189
				d		Day in month  			Number  				10
				F		Day of week in month  	Number  				2
				E		Day name in week  		Text  					Tuesday; Tue
				u		Day number of week   	Number  				1(1 = Monday, ..., 7 = Sunday)
				a		Am/pm marker  			Text  					PM
				H		Hour in day (0-23)  	Number  				0
				k		Hour in day (1-24)  	Number 					24
				K		Hour in am/pm (0-11)  	Number 					0
				h		Hour in am/pm (1-12)  	Number  				12
				m		Minute in hour  		Number  				30
				s		Second in minute  		Number  				55
				S		Millisecond  			Number  				978
				z		Time zone  				General time zone  		Pacific Standard Time; PST; GMT-08:00
				Z		Time zone  				RFC 822 time zone  		-0800
				X  		Time zone  				ISO 8601 time zone  	-08; -0800; -08:00


	 */
}
