package cn.itcast.example;
class Animal04{
	public Animal04(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog04 extends Animal04{
	public Dog04() {
		super("沙皮狗");
	}
}
public class Example04 {
	public static void main(String []args) {
		Dog04 dog=new Dog04();
	}

}
