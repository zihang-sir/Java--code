package cn.itcast.example;
class Animal02{
	void shout() {
		System.out.println("动物发出的叫声");
	}
}
class Dog02 extends Animal02{
	void shout() {
		System.out.println("汪汪汪。。。。");
	}
}
public class Example02 {
	public static void main(String[]args) {
		Dog02 dog=new Dog02();
		dog.shout();
	}
}
	


