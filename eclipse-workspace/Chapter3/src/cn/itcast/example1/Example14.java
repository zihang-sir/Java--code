package cn.itcast.example1;

public class Example14 {
	static {
		System.out.println("���Ը���ľ�̬�����ִ����");
	}
	public static void main(String []args) {
		Person p1=new Person();
		Person p2=new Person();
	}

}
class Person{
	static {
		System.out.println("Person�еľ�̬�����ִ����");//��̬����������һ��ʹ��ʱ�Żᱻ���أ�ֻ����һ��
	}
}
