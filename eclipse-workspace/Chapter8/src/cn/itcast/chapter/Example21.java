package cn.itcast.chapter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Example21 extends JFrame{
	private JComboBox comboBox;
	private JTextField field;
	public Example21() {
		JPanel panel=new JPanel();
		comboBox =new JComboBox();
		comboBox.addItem("请选择城市：");
		comboBox.addItem("北京");
		comboBox.addItem("天津");
		comboBox.addItem("南京");
		comboBox.addItem("上海");
		comboBox.addItem("重庆");
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String item=(String)comboBox.getSelectedItem();
				if("请选择城市".equals(item)) {
					field.setText("");
				}else {
					field.setText("您选择的城市是:"+item);
				}
			}
			
		});
		field=new JTextField(20);
		panel.add(comboBox);
		panel.add(field);
		this.add(panel,BorderLayout.NORTH);
		this.setSize(350, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example21();
	}

}
