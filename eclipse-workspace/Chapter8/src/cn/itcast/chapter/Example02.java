package cn.itcast.chapter;
import java.awt.*;
public class Example02 {
     public static void main(String []args) {
    	 final Frame f=new Frame("Flowlayout");
    	 f.setLayout(new FlowLayout(FlowLayout.LEFT ,20,30));
    	 f.setSize(220,300);
    	 f.setLocation(300,200);
    	 f.add(new Button("第一个按钮"));
    	 f.add(new Button("第二个按钮"));
    	 f.add(new Button("第三个按钮"));
    	 f.add(new Button("第四个按钮"));
    	 f.add(new Button("第五个按钮"));
    	 f.add(new Button("第六个按钮"));
    	 f.setVisible(true);
     }
}
