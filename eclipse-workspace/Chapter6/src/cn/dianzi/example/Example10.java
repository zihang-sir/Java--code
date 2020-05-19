package cn.dianzi.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("1", "jack");
		map.put("2", "rose");
		map.put("3", "lucy");
		map.put("3", "mary");
		System.out.println("1:"+map.get("1"));
		System.out.println("2:"+map.get("2"));
		System.out.println("3:"+map.get("3"));
		//±éÀúMAPÖÐµÄ¼ü
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		//
		Collection values=map.values();
		Iterator it2=values.iterator();
		while(it2.hasNext()) {
			Object value=it2.next();
			System.out.println(value);
		}
	}

}
