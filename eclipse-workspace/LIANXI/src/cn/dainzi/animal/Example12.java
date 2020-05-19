package cn.dainzi.animal;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		Dog dog=new Dog();
		skill(dog);
		skill(cat);
	}
	public static void skill(Animal an) {
		if(an instanceof Cat) {
			an.sleep();
			((Cat) an).catchMouse();
		}
		else if(an instanceof Dog) {
			an.sleep();
			((Dog) an).watchBaby();
		}
	}
}
