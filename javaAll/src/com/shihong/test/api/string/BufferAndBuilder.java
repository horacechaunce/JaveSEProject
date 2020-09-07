package com.shihong.test.api.string;

/**
 * @author shihong on 2020/9/7.
 * StringBuffer StringBuilder
 *
 */
public class BufferAndBuilder {

	/*
		String,StringBuffer,StringBuilder三者的区别
			String是不可变的字符序列
				字符串是一个不可变的字符序列：
					是指字符串的底层是一个char[] 因为数组的定义时就固定了长度，所以说它是一个不可变的常量，
					它存储在字符串常量池中，字符串的第一次拼接都会开辟新的char[]空间
			后两者是可变的字符序列
				其它这两种底层也同样是字符数组，但是它定义的时候是一个固定长度为16初始值的缓冲区char[]
				并且可以通过append()方法进行扩充长度为原字符串长度 *2 +2 的新数组
				定义时也可以指定缓存区长度，通过构造器 new StringBuffer(32);
				也可以直接使用new StringBuffer("123132");来定义，它的长度是 "123123".length +16
				StringBuffer 线程安全的，效率相对较低
				StringBuilder 线程不安全的，效率相对较高
				它们使用相同的API,使用方式完全一致

		在使用String进行字符串拼接的时候，多个进行拼接会不断的开辟内存空间效率低，后者效率相对较高


		常用的函数：
			StringBuffer append(String str); 添加;
			StringBuffer insert(int offset, String str);
				指定位置插入,即将指定的下标位置替换成为指定的字符串（含头不含尾）
			int indexOf(String str) 返回子字符串的索引位置
			int lastIndexOf(String str)  从后往前找，返回子字符串的索引位置

			String subString(int start, int end); 返回子串
			String delete(int st, int end); 删除指定位置的字符串，（含头不含尾）
			String deleteCharAt(int index); 删除指定位置的字符串，（含头不含尾）
			String toString(); 转换为String

	 */


}
