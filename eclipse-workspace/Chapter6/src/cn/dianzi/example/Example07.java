package cn.dianzi.example;

import java.util.HashSet;
import java.util.Iterator;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("jack");
		set.add("eve");
		set.add("rose");
		set.add("rose");
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}
