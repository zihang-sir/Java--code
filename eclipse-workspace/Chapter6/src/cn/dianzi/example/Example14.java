package cn.dianzi.example;

import java.util.*;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new LinkedHashMap();
		map.put("1", "jack");
		map.put("2", "rose");
		map.put("3", "lucy");
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
