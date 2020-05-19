package cn.dianzi.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("jack");
		list.add("annie");
		list.add("rose");
		list.add("tom");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if("annie".equals(obj)) {
				//list.remove(obj);
				//break;
				it.remove();
			}
		}
		System.out.println(list);
	}

}
