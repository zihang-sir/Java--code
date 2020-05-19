package cn.itcast.example;
class Person{
	public Person() {
		System.out.println("无参的构造函数被调用了");
	}
	public Person(String name) {
		this ();//调用无参的构造函数,只能在构造方法中使用，必须位于第一行，只能出现一次
		System.out.println("有参的构造函数被调用了");
	}
	
}
public class Example10 {
	public static void main(String []args) {
		Person p=new Person("itcast");//实例化Person对象
	}

}
