package cn.dianzi.kaoshi;
class Animal {
	String name; // ����name����

	// ���嶯��еķ���
	void shout() {
		System.out.println("���﷢������");
	}
}

// ����Dog��̳�Animal��
class Dog extends Animal {
	// ����һ����ӡname�ķ���
	public void printName() {
		System.out.println("name=" + name);
	}
}

// ���������
public class T1 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����һ��Dog���ʵ������
		dog.name = "ɳƤ��"; // ΪDog���name���Խ��и�ֵ
		dog.printName(); // ����dog���getInfo()����
		dog.shout(); // ����dog��̳�����shout()����
	}
}
