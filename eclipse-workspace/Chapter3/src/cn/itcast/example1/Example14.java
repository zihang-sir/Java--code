package cn.itcast.example1;

public class Example14 {
	static {
		System.out.println("测试该类的静态代码块执行了");
	}
	public static void main(String []args) {
		Person p1=new Person();
		Person p2=new Person();
	}

}
class Person{
	static {
		System.out.println("Person中的静态代码块执行了");//静态代码块在类第一次使用时才会被加载，只加载一次
	}
}
