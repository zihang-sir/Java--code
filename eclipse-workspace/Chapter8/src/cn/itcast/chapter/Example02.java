package cn.itcast.chapter;
import java.awt.*;
public class Example02 {
     public static void main(String []args) {
    	 final Frame f=new Frame("Flowlayout");
    	 f.setLayout(new FlowLayout(FlowLayout.LEFT ,20,30));
    	 f.setSize(220,300);
    	 f.setLocation(300,200);
    	 f.add(new Button("��һ����ť"));
    	 f.add(new Button("�ڶ�����ť"));
    	 f.add(new Button("��������ť"));
    	 f.add(new Button("���ĸ���ť"));
    	 f.add(new Button("�������ť"));
    	 f.add(new Button("��������ť"));
    	 f.setVisible(true);
     }
}
