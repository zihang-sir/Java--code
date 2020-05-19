package cn.dianzi.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Example03 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
		while(it.hasNext()) {             //指针还在最后一个元素，直接退出
			System.out.println(it.next());
		}
	}

}
