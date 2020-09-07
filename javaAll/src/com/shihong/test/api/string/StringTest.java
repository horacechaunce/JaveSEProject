package com.shihong.test.api.string;
import java.lang.String;

/**
 * @author shihong on 2020/9/7.
 * 面试应用题
 */
public class StringTest {

	//模拟trim()方法
	public static String myTrim(String str) {
		char[] value = str.toCharArray();
		int len = value.length;
		int st = 0;

		while ((st < len) && (value[st] <= ' ')) {
			st++;
		}
		while ((st < len) && (value[len - 1] <= ' ')) {
			len--;
		}
		return str.substring(st, len);
	}

	//字符串的反转 ，指定位置反转
	public static String reverse(String str, int st, int end){
		char[] chars = str.toCharArray();
		//从头尾两侧开始分别开始替换相应位置
		for (int i = st, j = end ; i <j ; i++ ,j--) {
			char c = chars[i];
			chars[i] = chars[j];
			chars[j] = c;
		}
		return new String(chars);
	}

	//查找相同字符串出现的次数（str2 在string中出现的次数）
	public static int getCount(String string, String str2) {
		int count = 0;
		int index = 0;
		//利用indexOf（）方法在从index位置开始查找str2 找到则返回下标index，找不到则返回 -1
		while ((index = string.indexOf(str2,index)) != -1) {
			count ++ ;
			index +=1;
		}

		return count;
	}

	//在两个字符串中查询最大相同子串
	public static String getSame(String string, String str) {
		String maxStr = string.length() > str.length() ? string : str;
		String minStr = string.length() > str.length() ? str : string;
		//因为查找最大相同子串，不确定两个字符串中有什么样的字符串是相同的，所以要对其进行遍历缩减
		//因此遍历最小串为最佳方式，先获取最小串长度
		int length = minStr.length();
		for (int i = 0; i < length; i++) {
			//外层循环决定查找次数，内层循环进行缩减移动匹配
			// k <= length 是因为缩减查找的方式使用subString方法包含头，不包含尾，
			//所以要用<= , 为了每次缩减 所以 k = length - i,
			for (int j = 0, k = length - i; k <= length; j++,k++) {
				String substring = minStr.substring(j, k);
				if (maxStr.contains(substring)) {
					return substring;
				}
			}
			
		}
		return null;

	}

	/*public static void main(String[] args) {
		String str = "123ads456adsadsadadadada";
		String str2 = "123456ads54essadadadada";
		*//*int ada = getCount(str, "ada");
		System.out.println(ada);*//*
		String same = getSame(str, str2);
		System.out.println(same);
	}*/



}
