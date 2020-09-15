package com.shihong.test.api.date;

import java.util.Calendar;

/**
 * @author shihong on 2020/9/15.
 * 日历类静态常量
 */
public class CalendarStaticFinalField {
	/**
	 * 静态常量

	 */
	public static void main(String[] args) {

		//静态常量: 以下都是常量
		//指示年
		int year = Calendar.YEAR;// 1

		//指示月份
		int month = Calendar.MONTH;// 2

		//指示当前时间为多少号（日历式的多少号）
		int date = Calendar.DATE;// 5

		//指示小时（12小时制）
		int hour = Calendar.HOUR;// 10

		//指示小时（24小时制）
		int hourOfDay = Calendar.HOUR_OF_DAY;// 11

		//指示分钟数
		int minute = Calendar.MINUTE;// 12

		//指示秒数
		int second = Calendar.SECOND;// 13

		//指示毫秒
		int millisecond = Calendar.MILLISECOND;// 14
		//当前时间是所在当前月的第几个星期(日历式的第几周)
		int weekOfMonth = Calendar.WEEK_OF_MONTH;//4

		//当前时间是所在当前年的第几个星期
		int weekOfYear = Calendar.WEEK_OF_YEAR;//3

		//当前时间是所在当前月的第几个星期,以月份天数为标准,一个月的1号为第一周,8号为第二周
		int dayOfWeekInMonth = Calendar.DAY_OF_WEEK_IN_MONTH;//8
		//一周7天当中,当前时间是星期几
		int dayOfWeek = Calendar.DAY_OF_WEEK;//7

		//指示一年中的第几天
		int dayOfYear = Calendar.DAY_OF_YEAR;//6

		//指示一月中的第几天,结果等同于Calendar.DATE
		int dayOfMonth = Calendar.DAY_OF_MONTH;//5
		//指示上午还是下午
		int amPm = Calendar.AM_PM;//9
		//周天
		int sunday = Calendar.SUNDAY;//1
		//周一
		int monday = Calendar.MONDAY;//2
		//周二
		int tuesday = Calendar.TUESDAY;//3
		//周三
		int wednesday = Calendar.WEDNESDAY;//4
		//周四
		int thursday = Calendar.THURSDAY;//5
		//周五
		int friday = Calendar.FRIDAY;//6
		//周六
		int saturday = Calendar.SATURDAY;//7
	}

}
