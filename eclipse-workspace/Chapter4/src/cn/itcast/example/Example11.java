package cn.itcast.example;
interface Animal11{
	String ANIMAL_BEHAVIOR="�������Ϊ";//ȫ�ֳ���
	void breathe();
	void run();
}
class Dog11 implements Animal11{
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR+":���ں���");
	}
	public void run() {
		System.out.println(ANIMAL_BEHAVIOR+":���ڱ���");
	} 
}
public class Example11 {
	public static void main(String []args) {
		Dog11 dog =new Dog11();
		dog.breathe();
		dog.run();
	}

}
