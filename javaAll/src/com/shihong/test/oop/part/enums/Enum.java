package com.shihong.test.oop.part.enums;

/**
 * @author shihong on 2020/9/3.
 *         枚举类
 */
public class Enum {

	/*
		jdk官方定义：可以定义有限数量的可穷举数据集
		Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
		Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割

		JDK1.5之前需要自定义枚举类
		JDK 1.5 新增的 enum 关键字用于定义枚举类
		若枚举只有一个成员, 则可以作为一种单例模式的实现方式
		当确定一个类有几个对象时使用枚举
		使用enum关键字创建枚举类

		枚举类的属性：
			a)  枚举类对象的属性不应允许被改动, 所以应该使用 private final 修饰
			b)  枚举类的使用 private final 修饰的属性应该在构造器中为其赋值
			c)  若枚举类显式的定义了带参数的构造器, 则在列出枚举值时也必须对应的传 入参数

		枚举类成员
			枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。
			枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。

				实例
				enum Color
				{
					RED, GREEN, BLUE;

					// 构造函数
					private Color()
					{
						System.out.println("Constructor called for : " + this.toString());
					}

					public void colorInfo()
					{
						System.out.println("Universal Color");
					}
				}

				public class Test
				{
					// 输出
					public static void main(String[] args)
					{
						Color c1 = Color.RED;
						System.out.println(c1);
						c1.colorInfo();
					}
				}
			执行以上代码输出结果为：
				枚举类有三个对象，Color.RED创建对象时调用三次构造器，分别打印三个对象对应的值，然后顺序执行
				Constructor called for : RED
				Constructor called for : GREEN
				Constructor called for : BLUE
				RED
				Universal Color





	 */


}

//枚举类的原理：
/*public class EnumDemo {

	public static void main(String[] args){
		//直接引用
		Day day =Day.MONDAY;
	}

}
//定义枚举类型
enum Day {
	MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//反编译后的文件
final class Day extends Enum {
	//编译器为我们添加的静态的values()方法
	public static Day[] values()
	{
		return (Day[])$VALUES.clone();
	}
	//编译器为我们添加的静态的valueOf()方法，注意间接调用了Enum也类的valueOf方法
	public static Day valueOf(String s)
	{
		return (Day)Enum.valueOf(com/zejian/enumdemo/Day, s);
	}
	//私有构造函数
	private Day(String s, int i)
	{
		super(s, i);
	}
	//前面定义的7种枚举实例
	public static final Day MONDAY;
	public static final Day TUESDAY;
	public static final Day WEDNESDAY;
	public static final Day THURSDAY;
	public static final Day FRIDAY;
	public static final Day SATURDAY;
	public static final Day SUNDAY;
	private static final Day $VALUES[];

	static
	{
		//实例化枚举实例
		MONDAY = new Day("MONDAY", 0);
		TUESDAY = new Day("TUESDAY", 1);
		WEDNESDAY = new Day("WEDNESDAY", 2);
		THURSDAY = new Day("THURSDAY", 3);
		FRIDAY = new Day("FRIDAY", 4);
		SATURDAY = new Day("SATURDAY", 5);
		SUNDAY = new Day("SUNDAY", 6);
		$VALUES = (new Day[] {
				MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		});
	}
}

		从反编辑的文件可以看出，enum类是一个final的class类继承了java.lang.Enum类,
		Enum类中的toString方法重写了，返回值为name 所以打印枚举对象的时候直接输出属性名

		反编译文件中对各属性定义为static final 的类类型属性： 在static代码块中统一初始化，从0下标为开始
		并提供values()和 valueOf()方法这两个方法继承自java.lang.Enum类


		枚举类的创建 ：（自定义枚举类）
			a)   私有化构造器
			b)  类的内部创建对象

		a)	Enum枚举类
			a)  必须在枚举类的第一行声明枚举类对象。

		b)  枚举类和普通类的区别：
			a)	使用 enum 定义的枚举类默认继承了 java.lang.Enum 类
			b)  枚举类的构造器只能使用 private 访问控制符
			c)  枚举类的所有实例必须在枚举类中显式列出(, 分隔 ; 结尾). 列出的实例系统会自动添加 public static final 修饰

		c)  JDK 1.5 中可以在 switch 表达式中使用Enum定义的枚举类的对象作为表 达式,
			case 子句可以直接使用枚举值的名字, 无需添加枚举类作为限定

		d)	枚举类的主要方法：
			a)  values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历 所有的枚举值。
			b)  valueOf(String str)：可以把一个字符串转为对应的枚举类对象。
				参数str：要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常



*/

/*enum Season {
	SPRING("春天", "万物复苏",1),
	SUMMER("夏天", "烈日炎炎",2),
	AUTUMN("秋天", "落叶飘飘",3),
	WINTER("冬天", "雪花漫天",4);


	private String name;
	private String desc;
	private int value;

	private Season(String name,String desc, int value){
		this.name=name;
		this.desc=desc;
		this.value=value;
	}


	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Season winter = Season.WINTER;
		System.out.println(winter.getDesc());
		System.out.println(winter.getName());
		System.out.println(winter.getValue());
	}
}*/


