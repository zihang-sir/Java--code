package cn.itcast.example;
interface Animal14{
	void shout();
}
class Cat14 implements Animal14{
	 public void shout() {
		System.out.println("����");
	}
	void sleep() {
		System.out.println("è˯��");
	}
	
}
public class Example14 {
	public static void main(String[]args) {
		Cat14 cat=new Cat14();
		animalShout(cat);
	}
	public static void animalShout(Animal14 animal) {
		Cat14 cat=(Cat14)animal;
		cat.shout();
		cat.sleep();
	}

}
