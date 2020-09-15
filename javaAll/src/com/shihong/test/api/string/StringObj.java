package com.shihong.test.api.string;

/**
 * @author shihong on 2020/9/4.
 * 字符串
 */
public class StringObj {

	/*

		String类较常用构造方法:
			a)	String s1 = new String();
			b)	String s2 = new String(String original);
			c)	String s3 = new String(char[] a);
			d)	String s4 = new String(char[] a,int startIndex,int count)

		 字符串的特性：
			a)  String是一个final类，代表不可变的字符序列
			b) 字符串是不可变的。一个字符串对象一旦被配置，其内容是不可变的。

		字符串是一个不可变的字符序列：
			是指字符串的底层是一个char[] 因为数组的定义时就固定了长度，所以说它是一个不可变的常量，
			它存储在字符串常量池中，字符串的第一次拼接都会开辟新的char[]空间

		String str1 = new String("abc") 与 String str2 = "abc"的区别
			见当前包路径下的str1Andstr2.png图片


		获取字符串的方法;
			String concat(String str);  拼接字符串
			String subString(int startIndex); 获取字符串的子串
			String substring(int start,int end) 截取子串包含头，不包含尾，意思是截取的子串包含start下标字符，不包含end下标字符
			String toLowerCase（）转换小写，
			String toUpperCase();转换大写
			String trim(); 删除首尾空格/制表符

		搜索方法: (下面方法都是查询指定字符的，也有相应的查找指定字符串的同名方法)
			int indexOf(int ch); //获取指定字符在字符串中的位置，若没有返回 -1
			int indexOf(int ch, int start); //从指定位置开始搜索 若没有返回 -1
			int lastIndexOf(int ch); 反向查询指定字符 若没有返回 -1
			int lastIndexOf(int ch, start); 反向查询指定字符 若没有返回 -1

		判断方法：
			boolean equals(Object obj); 判断两个字符串内容是否相同
			boolean equalsIgnoreCase(String str); 判断两个字符串内容是否相同， 忽略大小写
			boolean contains(String str); 是否包含某字符串
			boolean startWith(String str); / boolean endWith(String str); 判断是否以某字符串开始/结束
			boolean isEmpty(); 是否为空

		其它方法：
			char charAt(int index)  获取指定下标位置的字符
			int length(); 获取字符串长度

			将数组转换在字符串：
				String(char[] ch);
				String(char[] ch, int offset, int count);将数组中的一部分转换成字符串
					其中： offset 是开始索引位置， count 是转换的字符个数

			静态方法：
				static String copyValueOf(char[] ch);
				static String copyValueOf(char[] ch, int offset, int count);
				static String valueOf(char[] ch);

			将字符串转换成字符数组 ： char[] toCharArray();
			String replace(String old, String newStr); 替换字符串
			String replace(char old, char newCh); 替换字符
			String[] split(String str); 根据指定的符号切割


	 */




}
