package cn.itcast.example;
class Animal03{
	String name="����";
	void shout() {
		System .out.println("���﷢���Ľ���");
	}
}
class Dog03 extends Animal03{
	String name ="Ȯ��";
	void shout() {
		super.shout();
	}
	void printName() {
		System.out.println("name="+super.name);//���ʸ����Ա����
	}
}
public class Example03 {
	public static void main(String []args) {
		Dog03 dog=new Dog03();
		dog.shout();
		dog.printName();
	}

}
