package cn.itcast.example;
class Person{
	public Person() {
		System.out.println("�޲εĹ��캯����������");
	}
	public Person(String name) {
		this ();//�����޲εĹ��캯��,ֻ���ڹ��췽����ʹ�ã�����λ�ڵ�һ�У�ֻ�ܳ���һ��
		System.out.println("�вεĹ��캯����������");
	}
	
}
public class Example10 {
	public static void main(String []args) {
		Person p=new Person("itcast");//ʵ����Person����
	}

}
