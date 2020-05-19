package cn.itcast.example;

public class Example14 {
	static {
		System.out.println("测试类的静态代码块执行了");
	}
	public static void main(String []args) {
		Person14 p1=new Person14();
		Person14 p2=new Person14();
	}

}
class Person14{
	static {
		System.out.println("Person类中的静态代码块执行了");
	}
}
