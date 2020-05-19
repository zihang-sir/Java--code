package cn.itcast.example;
class Animal{
	String name ;
	void shout() {
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	public void printName() {
		System.out.println("name="+name);
	}
}
public class Example01 {
	public static void main(String []args) {
		Dog dog=new Dog ();
		dog.name ="沙皮";
		dog.printName();
		dog.shout();
	}

}
