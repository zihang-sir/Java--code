package cn.dianzi.demo;
interface Animal12 {
	String ANIMAL_BEHAVIOR="�������Ϊ";
	void breathe();
	void run();
}
interface LandAnimal12 extends Animal12{
	void LiveOnLand();
}
class Dog12 implements  LandAnimal12{

	@Override
	public void LiveOnLand() {
		// TODO Auto-generated method stub
		System.out.println("����½���ϵĶ���");
	}
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR+":"+"���ں���");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(ANIMAL_BEHAVIOR+":"+"���ڱ���");
	}
	
}
public class Example12 {
	public static void main(String[]args) {
		Dog12 dog=new Dog12();
		dog.breathe();
		dog.run();
		dog.LiveOnLand();
	}
	

}
