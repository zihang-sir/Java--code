package cn.dianzi.example;

import java.util.ArrayList;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合长度为："+list.size());
		System.out.println("第二个元素是："+list.get(1));
	}

}
