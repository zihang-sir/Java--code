package cn.itcast.test01;

public class KeyBoard implements USB{
	public void turnOn() {
		System.out.println("键盘启动了");
	}
	public void turnOff() {
		System.out.println("键盘关闭了");
	}
}
