package cn.itcast.test01;

public class Task01 {
	public static void main(String []args) {
		Computer c =new Computer();
		c.add(new Mouse());
		c.add(new Mic());
		c.add(new KeyBoard());
		System.out.println("�򿪼����:");
		c.powerOn();
		System.out.println("�رռ����:");
		c.powerOff();
	}

}
