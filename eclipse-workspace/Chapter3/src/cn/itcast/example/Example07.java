package cn.itcast.example;
class Person1{
	String name;
	int age;
	public Person1(String con_name,int con_age) {
		name=con_name;
		age=con_age;
	}
	public Person1(String con_name) {
		name=con_name;
	}
	public void speak() {
		System.out.println("大家好，我叫"+name+",我今年"+age+"岁");
	}
}
public class Example07 {
	public static void main(String []args) {
		Person1 p1=new Person1("韩强");
		Person1 p2=new Person1("晓英",27);
		p1.speak();
		p2.speak();
	}

}
