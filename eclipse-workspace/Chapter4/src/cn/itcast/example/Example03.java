package cn.itcast.example;
class Animal03{
	String name="动物";
	void shout() {
		System .out.println("动物发出的叫声");
	}
}
class Dog03 extends Animal03{
	String name ="犬类";
	void shout() {
		super.shout();
	}
	void printName() {
		System.out.println("name="+super.name);//访问父类成员变量
	}
}
public class Example03 {
	public static void main(String []args) {
		Dog03 dog=new Dog03();
		dog.shout();
		dog.printName();
	}

}
