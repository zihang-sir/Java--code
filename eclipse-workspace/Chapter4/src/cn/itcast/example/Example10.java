package cn.itcast.example;
abstract class Animal10{
	abstract void shout();//������󷽷�
}
class Dog10 extends Animal10{
	void shout() {
		System.out.println("����");
	}
}
public class Example10 {
	public static void main(String []args) {
		Dog10 dog=new Dog10();
		dog.shout();
	}

}
