package cn.itcast.example;
interface Animal11{
	String ANIMAL_BEHAVIOR="动物的行为";//全局常量
	void breathe();
	void run();
}
class Dog11 implements Animal11{
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR+":狗在呼吸");
	}
	public void run() {
		System.out.println(ANIMAL_BEHAVIOR+":狗在奔跑");
	} 
}
public class Example11 {
	public static void main(String []args) {
		Dog11 dog =new Dog11();
		dog.breathe();
		dog.run();
	}

}
