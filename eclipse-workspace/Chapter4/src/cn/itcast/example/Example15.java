package cn.itcast.example;
interface Animal15{
	void shout() ;
}
class Cat15 implements Animal15{
	 public void shout() {
		System.out.println("ß÷ß÷");
	}
	void sleep() {
		System.out.println("Ã¨Ë¯¾õ");
	}
}
class Dog15 implements Animal15{

	public void shout() {
		System.out.println("ÍôÍô");
	}
	
}
public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog15 dog=new Dog15();
		animalShout(dog);
    }

	private static void animalShout(Animal15 animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Cat15) {
			Cat15 cat=(Cat15)animal;
			cat.sleep();
			cat.shout();
		}else {
			System.out.println("this animal is not a cat");
		}
	}

}
