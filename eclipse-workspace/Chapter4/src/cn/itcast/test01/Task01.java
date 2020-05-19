package cn.itcast.test01;

public class Task01 {
	public static void main(String []args) {
		Computer c =new Computer();
		c.add(new Mouse());
		c.add(new Mic());
		c.add(new KeyBoard());
		System.out.println("打开计算机:");
		c.powerOn();
		System.out.println("关闭计算机:");
		c.powerOff();
	}

}
