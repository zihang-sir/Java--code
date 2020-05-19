package cn.itcast.chapter;
import java.awt.*;
public class Example01 {
	public static void main(String[]args) {
		Frame f=new Frame("我的窗体");
		f.setSize(400,300);//窗体宽，高
		f.setLocation(300,200);//窗体左上角坐标
		f.setVisible(true);//设置窗体可见
	}
}
