package com.shihong.test.api.date;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author shihong on 2020/9/15.
 * 日历类常用方法
 */
public class CalendarMethod {


	/**
	 * 此类中为日历类常用方法，方法目录如下：
	 * 		1，get方法	获得年、月、日、时、分、秒、毫秒
	 * 		2，set方法	设置年、月、日、时、分、秒、毫秒
	 * 		3，add方法	基于日历的规则实现日期加减。
	 * 		4，after方法	 判断是否在另一个日期对象表示的时间之后
	 * 		5，before方法  判断是否在另一个日期对象表示的时间之前
	 * 		6，clear方法	设置为初始状态。
	 * 		7，clone方法
	 * 		8，compareTo方法
	 * 		9，equals方法
	 * 		10，getActualMaximum方法
	 * 		11，getActualMinimum方法
	 * 		12，getMaximum方法	返回指定日历字段的理论最大值。
	 * 		13，getTime方法	返回Date对象
	 * 		14，getTimeInMillis方法  获取时间戳
	 * 		15，setTimeInMillis方法	设置时间戳
	 *
	 *	最后在最下面有几个实例使用
	 *
	 *
	 */



	/*
	静态方法

	get方法
		实例*/
	//获得年、月、日、时、分、秒、毫秒
	public void getTest() {
		Calendar ca = Calendar.getInstance();
		ca.get(Calendar.YEAR);
		ca.get(Calendar.MONTH);
		ca.get(Calendar.DATE);
		ca.get(Calendar.HOUR_OF_DAY);
		ca.get(Calendar.MINUTE);
		ca.get(Calendar.SECOND);
		ca.get(Calendar.MILLISECOND);
		//当前时间是所在当前月的第几个星期(日历式的第几周)
		ca.get(Calendar.WEEK_OF_MONTH);

		//当前时间是所在当前年的第几个星期(日历式的第几周)
		ca.get(Calendar.WEEK_OF_YEAR);

		//当前时间是所在当前月的第几个星期,以月份天数为标准,一个月的1号为第一周,8号为第二周
		ca.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		//一周7天当中,当前时间是星期几, 返回结果为1-7
		ca.get(Calendar.DAY_OF_WEEK);

		//一年中的第几天
		ca.get(Calendar.DAY_OF_YEAR);
		//判断当前时间是AM,还是PM,若是AM返回结果为0,若是PM返回结果为1
		ca.get(Calendar.AM_PM);
	}

	/*set方法

		设置日历字段的值。

		语法

		set(int field, int value);
		set(int year, int month, int day);
		set(int year, int month, int day, int hour, int minute);
		set(int year, int month, int day, int hour, int minute, int second);
		设置年、月、日、时、分、秒、毫秒

		月份的正常值范围为0-11，0表示一月，以此类推。日期的正常值范围为1-31，结尾数字视月份而定。

		*/
	public void setTest() {
		//2019-01-01 00:00:00
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.YEAR,2019);
		ca.set(Calendar.MONTH,0);
		ca.set(Calendar.DATE,1);
		ca.set(Calendar.HOUR_OF_DAY,0);
		ca.set(Calendar.MINUTE,0);
		ca.set(Calendar.SECOND,0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(ca.getTime()));
//		所有日历字段都有正常的值范围，但是它们也支持不正常的值范围，以正常值范围为基点，
//		设置向前向后的值都可以。例如所有日历字段都可以设置负值（年份不考虑）。
//
//		设置：2019年00月  --> 实际：2019年01月
//		设置：2019年-1月  --> 实际：2018年12月, 以此类推
//
//		设置：2月00日  --> 实际：1月31日
//		设置：2月-1日  --> 实际：1月30日, 以此类推
//
//		设置：1小时-1分钟  --> 实际：0小时59分钟
//
//		设置：1分钟-1秒钟  --> 实际：0分钟59秒
		//2018-12-31
		ca.set(Calendar.YEAR,2019);
		ca.set(Calendar.MONTH,0);
		ca.set(Calendar.DATE,0); //设置为0天，指向上月的最后一天
		//2018-12-30
		ca.set(Calendar.YEAR,2019);
		ca.set(Calendar.MONTH,0);
		ca.set(Calendar.DATE,-1);
		//10:09:59
		ca.set(Calendar.HOUR_OF_DAY,10);
		ca.set(Calendar.MINUTE,10);
		ca.set(Calendar.SECOND,-1);
		//09:58:59
		ca.set(Calendar.HOUR_OF_DAY,10);
		ca.set(Calendar.MINUTE,-1);
		ca.set(Calendar.SECOND,-1);
//		将Calendar日期对象指向当前周的某一天

		//将日历对象指向当前周的周天
		ca.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);//第二个参数的取值范围是表示周一到周天的七个静态常量

	}
	/*add方法
		基于日历的规则实现日期加减。
		语法
		add(int field, int amount);
		为当前Calendar日期对象加上或减去指定的时间量。参数amount表示日期的增量，可以为负值。
	实例*/

	public void testAdd() {
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.YEAR, 2019);

		//当前日历年份加一
		ca.add(Calendar.YEAR, 1);
		System.out.println(ca.get(Calendar.YEAR)); //2020

		//当前日历年份减一
		ca.add(Calendar.YEAR, -1);
		System.out.println(ca.get(Calendar.YEAR)); //2019
		//Calendar ca = Calendar.getInstance();
		ca.set(Calendar.MONTH, 10);

		//当前日历月份加一
		ca.add(Calendar.MONTH, 1);
		System.out.println(ca.get(Calendar.MONTH)); //11

		//当前日历月份减一
		ca.add(Calendar.MONTH, -1);
		System.out.println(ca.get(Calendar.MONTH)); //10
		ca.set(Calendar.DAY_OF_MONTH, 10);

		//当前日历日期加一
		ca.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH)); //11

		//当前日历日期减一
		ca.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH)); //10
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //5

		ca.add(Calendar.DAY_OF_WEEK, 1);
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //6
	}

	//after方法
	/**
	 *
	 * 判断Calendar日期对象表示的时间是否在另一个日期对象表示的时间之后，返回true或false。例如2020年在2019年之后。
	 */
	public void afterTest(){
		Calendar cal = Calendar.getInstance();
		Calendar future = Calendar.getInstance();
		future.set(Calendar.YEAR, 2020);
		System.out.println(future.after(cal)); //true
	}

	//before方法
	/**
	 * 判断Calendar日期对象表示的时间是否在另一个日期对象表示的时间之前，返回true或false。例如2019年在2020年之前。
	 */
	public void beforeTest(){
		Calendar cal = Calendar.getInstance();
		Calendar future = Calendar.getInstance();
		future.set(Calendar.YEAR, 2020);
		System.out.println(cal.before(future)); //true
	}

	//clear方法

	/**
	 * 该方法可以将所有日历字段的值和时间值（从历元至现在的毫秒偏移量）设置为初始状态。
	 * 一般使用set方法之前，必须先clear一下，否则很多信息会继承自系统当前时间。
	 */
	public void clearTest(){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime()); //Mon Aug 05 16:58:10 CST 2019
		cal.clear();
		System.out.println(cal.getTime()); //Thu Jan 01 00:00:00 CST 1970
	}

	//clone方法
	/**
	 * 创建并返回一个Calendar日期对象的副本，返回结果为Object类型。副本和原日期对象互不影响。
	 */
	public void cloneTest(){
		Calendar cal = Calendar.getInstance();
		cal.clear();
		Calendar clone = (Calendar)cal.clone();
		cal.set(2020,1,1);
		System.out.println(cal.getTime());   //Sat Feb 01 00:00:00 CST 2020
		System.out.println(clone.getTime()); //Thu Jan 01 00:00:00 CST 1970
	}

	//compareTo方法
	/**
	 * 比较当前Calendar日期对象与另一个Calendar日期对象表示的时间值大小（毫秒偏移量），
	 返回结果为0、1或-1。
	 其中0表示两个日期对象表示的时间值相等，
	 -1表示当前Calendar日期对象在另一个Calendar日期对象表示的时间之前。
	 1表示当前Calendar日期对象在另一个Calendar日期对象表示的时间之后。
	 */
	public void compareToTest(){
		Calendar cal1 = new GregorianCalendar(2015, 8, 15);
		Calendar cal2 = new GregorianCalendar(2008, 1, 02);

		int ret0 = cal1.compareTo(cal2);
		int ret1 = cal2.compareTo(cal1);

		System.out.println(ret0); // 1
		System.out.println(ret1); //-1
	}

	//equals方法

	/**
	 * 将Calendar日期对象与另一个Calendar日期对象比较，返回true或false。
	 */
	public void equalsTest(){
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar(2011, 04, 29);
		System.out.println(cal.equals(cal2)); //false
	}


	//getActualMaximum方法

	/**
	 * 返回指定日历字段可能拥有的实际最大值。
	 */
	public void maximumTest(){
		Calendar ca = Calendar.getInstance();

		//返回当前月最大天数
		System.out.println(ca.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(ca.getActualMaximum(Calendar.DATE));

		//返回23
		System.out.println(ca.getActualMaximum(Calendar.HOUR_OF_DAY));

		//返回11
		System.out.println(ca.getActualMaximum(Calendar.HOUR));

		//返回当前月有多少周
		System.out.println(ca.getActualMaximum(Calendar.WEEK_OF_MONTH));

		//返回当前年度最大天数
		System.out.println(ca.getActualMaximum(Calendar.DAY_OF_YEAR));
	}


	//getActualMinimum方法

	/**
	 * 返回指定日历字段可能拥有的实际最小值。
	 */
	public void minimumTest(){
		Calendar ca = Calendar.getInstance();

		//返回当前月最小天数：1
		System.out.println(ca.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(ca.getActualMinimum(Calendar.DATE));

		//返回0
		System.out.println(ca.getActualMinimum(Calendar.HOUR_OF_DAY));

		//返回0
		System.out.println(ca.getActualMinimum(Calendar.HOUR));

		//返回0
		System.out.println(ca.getActualMinimum(Calendar.WEEK_OF_MONTH));

		//返回当前年度最小天数：1
		System.out.println(ca.getActualMinimum(Calendar.DAY_OF_YEAR));
	}




	/**
		 getMaximum方法
		返回指定日历字段的理论最大值。
		getMinimum方法
		返回指定日历字段的理论最小值。

	 这两个方法都是以当前时间为准，比如当前月
	 */
	public void getMaximumTest(){
		//如果当前时间为2019-09-01
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getMaximum(Calendar.DAY_OF_MONTH));       //31, 理论最大值
		System.out.println(ca.getActualMaximum(Calendar.DAY_OF_MONTH)); //30, 实际最大值
	}




	//getTime方法
	/**
	 * 将Calendar日期对象转换为Date对象。
	 */
	public void getTimeTest(){
		Calendar ca = Calendar.getInstance();
		Date d = ca.getTime();
	}

	//setTime方法
	/**
	 * 将Date对象表示的时间值设置给Calendar日期对象。
	 */
	public void setTimeTest() {
		Calendar ca = Calendar.getInstance();
		ca.setTime(new Date());
	}

	//getTimeInMillis方法

	/**
	 * 返回Calendar日期对象的时间戳。
	 */
	public void getTimeMillisTest(){
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTimeInMillis()); //1567334892295
	}

	//setTimeInMillis方法

	/**
	 * 用给定long值设置日历的当前时间。
	 */
	public void setTimeMillisTest(){
		Calendar ca = Calendar.getInstance();
		ca.setTimeInMillis(500000);
		System.out.println(ca.getTime());
	}



	/*//roll方法  ----> void  roll(int field, boolean up)

	//在指定日历字段上添加或减去单个时间单元，不更改更大的字段。

	//如果当前时间是2019-09-01
	Calendar ca = Calendar.getInstance();
		System.out.println("Month is " + ca.get(Calendar.MONTH));
		ca.roll(Calendar.MONTH, false); //月份减一
		System.out.println("Month is " + ca.get(Calendar.MONTH));
		ca.roll(Calendar.MONTH, true);  //月份加一
		ca.roll(Calendar.MONTH, true);  //月份加一
		System.out.println("Month is " + ca.get(Calendar.MONTH));
	//假如今天周三
	Calendar ca = Calendar.getInstance();
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //4
		ca.roll(Calendar.DAY_OF_WEEK, false);
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //3
	//roll方法  ----> void  roll(int field, int amount)

	//在指定日历字段上添加或减去指定的时间单元，不更改更大的字段。

	//如果当前时间是2019-09-01
	Calendar ca = Calendar.getInstance();
		System.out.println("Month is " + ca.get(Calendar.MONTH));

		ca.roll(Calendar.MONTH, -2);  //月份减2
		System.out.println("Month is " + ca.get(Calendar.MONTH));
	//假如今天周三
	Calendar ca = Calendar.getInstance();
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //4
		ca.roll(Calendar.DAY_OF_WEEK, -2);
		System.out.println(ca.get(Calendar.DAY_OF_WEEK)); //2
	//七天制星期

	//Calendar类规定一周的七天分别用静态常量1-7表示，其中1表示周天，7表示周六。
	// Calendar类使用两个参数定义了特定于语言环境的七天制星期，其一星期的第一天，其二第一个星期的最少天数。

	//setMinimaldaysinfirstweek()

	//设置一年或一月中第一个星期所需的最少天数，取值范围为1-7，默认值为1，无返回值。

	//如果当前日期为2019-08-02,周五
	Calendar ca = Calendar.getInstance();
		System.out.println(ca.get(Calendar.WEEK_OF_MONTH)); //1

		ca.setMinimalDaysInFirstWeek(3);
		System.out.println(ca.get(Calendar.WEEK_OF_MONTH)); //1

		ca.setMinimalDaysInFirstWeek(4);
		System.out.println(ca.get(Calendar.WEEK_OF_MONTH)); //0


	//getMinimalDaysInFirstWeek();

	//获取一年或一月中第一个星期的最少天数。

	Calendar ca = Calendar.getInstance();
		System.out.println(ca.getMinimalDaysInFirstWeek()); //1
	//setFirstDayOfWeek()

	//默认一周的第一天是星期日（用静态常量1表示），结束时间是星期六（用静态常量7表示）。
	// 该方法可以设置星期几为一周的第一天，不会影响表示周一到周天的七个静态常量。

	Calendar ca = Calendar.getInstance();
	//设置周一为一周的第一天
		ca.setFirstDayOfWeek(Calendar.MONDAY);
	//修改一周的第一天会影响如下代码的执行结果。

		ca.get(Calendar.WEEK_OF_MONTH); //当前时间是所在当前月的第几个星期(日历式的第几周)
		ca.get(Calendar.WEEK_OF_YEAR)); //当前时间是所在当前年的第几个星期(日历式的第几周)
	*//**
	 * 如果当前日期为2019-08-02,周五
	 *//*
	Calendar ca = Calendar.getInstance();

//设置一年或一月中第一周最少4天
		ca.setMinimalDaysInFirstWeek(4);
		System.out.println(ca.get(Calendar.WEEK_OF_MONTH)); //0

//设置周一为一星期的第一天
		ca.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println(ca.get(Calendar.WEEK_OF_MONTH)); //1
	//getFirstDayOfWeek();

	//返回一周的第一天。


		System.out.println(ca.getFirstDayOfWeek());
*/


	//四、实例

	/**
	 * 将日历时间调整到0时0分0秒0毫秒
	 * @param ca
	 * @return
	 */
	public static Calendar toZero(Calendar ca){
		ca.set(Calendar.HOUR_OF_DAY, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		ca.set(Calendar.MILLISECOND, 0);
		return ca;
	}

	/**
	 * 获取某月所有日期
	 * @param dt
	 * @return
	 */
	public static List<Date> monthToDates(Date dt){
		//创建list列表
		List<Date> dts = new ArrayList<Date>();
		//创建日历
		Calendar ca = Calendar.getInstance();
		//设置时间
		ca.setTime(dt);
		//将时间调整到当前日历月份最后一天
		ca.set(ca.get(Calendar.YEAR),ca.get(Calendar.MONTH)+1, 0);
		//获取当前日历月份的实际总天数
		int dayNumOfMonth = ca.get(Calendar.DAY_OF_MONTH);
		//将日历时间指向当前日历月份的一号
		ca.set(Calendar.DAY_OF_MONTH, 1);
		for (int i = 0; i < dayNumOfMonth; i++, ca.add(Calendar.DATE, 1)) {
			//设置为0时0分0秒0毫秒
			ca.set(Calendar.HOUR_OF_DAY, 0);
			ca.set(Calendar.MINUTE, 0);
			ca.set(Calendar.SECOND, 0);
			ca.set(Calendar.MILLISECOND, 0);
			//将Calendar日期对象转换为Date时间对象，保存到提前创建的列表中
			Date d = ca.getTime();
			dts.add(d);
		}
		return dts;
	}

	/**
	 * 获取某月第一天
	 * @param dt
	 * @return
	 */
	public static Date getFstDayOfMonth(Date dt) {
		//创建日历
		Calendar ca = Calendar.getInstance();
		//设置时间
		ca.setTime(dt);
		//将日历时间调整到1号0时0分0秒
		ca.set(Calendar.DAY_OF_MONTH, 1);
		ca.set(Calendar.HOUR_OF_DAY, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		ca.set(Calendar.MILLISECOND, 0);
		//返回结果
		return ca.getTime();
	}

	/**
	 * 获取某月最后一天
	 * @param dt
	 * @return
	 */
	public static Date getLstDayOfMonth(Date dt) {
		//创建日历
		Calendar ca = Calendar.getInstance();
		//设置时间
		ca.setTime(dt);
		//将日历时间调整到上月最后一天
		ca.set(Calendar.DAY_OF_MONTH, 0);
		//将日历时间加一个月
		ca.add(Calendar.MONTH, 1);
		//将日历时间调整到0时0分0秒
		ca.set(Calendar.HOUR_OF_DAY, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		ca.set(Calendar.MILLISECOND, 0);
		//返回结果
		return ca.getTime();
	}
	/**
	 * 判断是不是当前月
	 */
	public static boolean isNowMonth(Date date) {
		//获取当前月第一天
		Date fst = getFstDayOfMonth(new Date());
		//获取目标月第一天
		Date fstOfDate = getFstDayOfMonth(date);
		//判断是否相等
		if(fst.equals(fstOfDate)) return true;
		return false;
	}

	/**
	 * //获取本周的第一天
	 * @param dt
	 * @return
	 */
	public static Date getFstDayOfWeek(Date dt) {
		//创建日历
		Calendar ca = Calendar.getInstance();
		//设置时间
		ca.setTime(dt);
		//设置周一为每周的第一天
		ca.setFirstDayOfWeek(Calendar.MONDAY);
		//设置一年或一月中第一周最少七天
		ca.setMinimalDaysInFirstWeek(7);
		//将Calendar日期对象指向本周的周一
		ca.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		//将日历时间调整为0时0分0秒
		ca.set(Calendar.HOUR_OF_DAY, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		ca.set(Calendar.MILLISECOND, 0);
		//返回结果
		return ca.getTime();
	}

	/**
	 * 获取本周所有的日期,按时间先后排序
	 * @param dt
	 * @return
	 */

	public static List<Date> mondayToDates(Date dt){
		//创建列表
		List<Date> dts = new ArrayList<Date>();
		//创建日历
		Calendar ca = Calendar.getInstance();
		//设置时间
		ca.setTime(dt);
		//设置周一为每周的第一天
		ca.setFirstDayOfWeek(Calendar.MONDAY);
		//将Calendar日期对象指向本周的周一
		ca.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		for (int i = 0; i < 7; i++, ca.add(Calendar.DATE, 1)) {
			//将日历时间调整为0时0分0秒
			ca.set(Calendar.HOUR_OF_DAY, 0);
			ca.set(Calendar.MINUTE, 0);
			ca.set(Calendar.SECOND, 0);
			ca.set(Calendar.MILLISECOND, 0);
			//将时间添加到list列表
			dts.add(ca.getTime());
		}
		return dts;
	}

	/**
	 *获取n天后,负数表示几天前
	 * @param date
	 * @param n
	 * @return
	 */
//

	public static Date getDayAfterToday(Date date,int n) {
		//创建日历
		Calendar ca = Calendar.getInstance();
		//设置时间
		ca.setTime(date);
		//日历时间加n天或者减n天
		ca.add(Calendar.DAY_OF_YEAR, n);
		//将日历时间调整为0时0分0秒
		ca.set(Calendar.HOUR_OF_DAY, 0);
		ca.set(Calendar.MINUTE, 0);
		ca.set(Calendar.SECOND, 0);
		ca.set(Calendar.MILLISECOND, 0);
		//返回结果
		return ca.getTime();
	}
	/**
	 * 计算两个日期相差的天数*/

	public int daysDiffer(String start, String end) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse(start);
		Date endDate = sdf.parse(end);
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		long timeStart = cal.getTimeInMillis();
		cal.setTime(endDate);
		long timeEnd = cal.getTimeInMillis();
		long ret = (timeEnd-timeStart)/(1000*3600*24);
		return Integer.parseInt(String.valueOf(ret));
	}
	public int daysDiffer(Date dateStart,Date dateEnd){
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateStart);
		long timeStart = cal.getTimeInMillis();
		cal.setTime(dateEnd);
		long timeEnd = cal.getTimeInMillis();
		long ret = (timeEnd-timeStart)/(1000*3600*24);
		return Integer.parseInt(String.valueOf(ret));
	}

}
