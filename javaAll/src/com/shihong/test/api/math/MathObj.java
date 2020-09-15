package com.shihong.test.api.math;

/**
 * @author shihong on 2020/9/15.
 *         math类使用
 */
public class MathObj {

	/*

		Math类
			a)	java.lang.Math提供了一系列静态方法用于科学计算；其方法的
			参数和返回值类型一般为double型。
			b)	abs	绝对值
			c)	acos,asin,atan,cos,sin,tan  三角函数
			d)	sqrt	平方根
			e)	pow(double a,doble b)	a的b次幂
			f)	log	自然对数
			g)	exp	e为底指数
			h)	max(double a,double b)
			i)	min(double a,double b)
			j)	random()	返回0.0到1.0的随机数
			k)	long round(double a)	double型数据a转换为long型（四舍五
			入）
			l)	toDegrees(double angrad)	弧度—>角度
			m)	toRadians(double angdeg)	角度—>弧度

	 * Math:用于数学运算的类。
	 * 成员变量：
	 * 		public static final double PI  3.141592653.....
	 * 		public static final double E
	 * 成员方法：
	 * 		public static int abs(int a)：绝对值
	 *		public static double ceil(double a):向上取整
	 *		public static double floor(double a):向下取整
	 *		public static int max(int a,int b):最大值 (min自学)
	 *		public static double pow(double a,double b):a的b次幂
	 *		public static double random():随机数 [0.0,1.0)
	 *		public static int round(float a) 四舍五入(参数为double的自学)
	 *		public static double sqrt(double a):正平方根
 	*/

	public static void main(String[] args) {
		// public static final double PI
		System.out.println("PI:" + Math.PI);
		// public static final double E
		System.out.println("E:" + Math.E);
		System.out.println("--------------");

		// public static int abs(int a)：绝对值
		System.out.println("abs:" + Math.abs(10));
		System.out.println("abs:" + Math.abs(-10));
		System.out.println("--------------");

		// public static double ceil(double a):向上取整
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("--------------");

		// public static double floor(double a):向下取整
		System.out.println("floor:" + Math.floor(12.34));
		System.out.println("floor:" + Math.floor(12.56));
		System.out.println("--------------");

		// public static int max(int a,int b):最大值
		System.out.println("max:" + Math.max(12, 23));
		// 需求：我要获取三个数据中的最大值
		// 方法的嵌套调用
		System.out.println("max:" + Math.max(Math.max(12, 23), 18));
		// 需求：我要获取四个数据中的最大值
		System.out.println("max:"
				+ Math.max(Math.max(12, 78), Math.max(34, 56)));
		System.out.println("--------------");

		// public static double pow(double a,double b):a的b次幂
		System.out.println("pow:" + Math.pow(2, 3));
		System.out.println("--------------");

		// public static double random():随机数 [0.0,1.0)
		System.out.println("random:" + Math.random());
		// 获取一个1-100之间的随机数
		System.out.println("random:" + ((int) (Math.random() * 100) + 1));
		System.out.println("--------------");

		// public static int round(float a) 四舍五入(参数为double的自学)
		System.out.println("round:" + Math.round(12.34f));
		System.out.println("round:" + Math.round(12.56f));
		System.out.println("--------------");

		//public static double sqrt(double a):正平方根
		System.out.println("sqrt:" + Math.sqrt(4));
	}

}
