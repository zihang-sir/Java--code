package cn.dianzi.demo;
interface Animal13{
	void shout();
}
class Cat13 implements Animal13{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("ß÷ß÷");
	}
}
class Dog13 implements Animal13{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("ÍôÍô");
	}
	
}
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal13 an1=new Cat13();
		Animal13 an2=new Dog13();
		animalshout(an1);
		animalshout(an2);
	}
	public static void animalshout(Animal13 an) {
		an.shout();
	}

}
