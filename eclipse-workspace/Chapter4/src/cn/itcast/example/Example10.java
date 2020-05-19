package cn.itcast.example;
abstract class Animal10{
	abstract void shout();//定义抽象方法
}
class Dog10 extends Animal10{
	void shout() {
		System.out.println("汪汪");
	}
}
public class Example10 {
	public static void main(String []args) {
		Dog10 dog=new Dog10();
		dog.shout();
	}

}
