package cn.itcast.example;
class Animal02{
	void shout() {
		System.out.println("���﷢���Ľ���");
	}
}
class Dog02 extends Animal02{
	void shout() {
		System.out.println("��������������");
	}
}
public class Example02 {
	public static void main(String[]args) {
		Dog02 dog=new Dog02();
		dog.shout();
	}
}
	


