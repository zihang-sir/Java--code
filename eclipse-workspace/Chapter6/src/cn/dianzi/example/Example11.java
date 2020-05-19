package cn.dianzi.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("1", "jack");
		map.put("2", "rose");
		map.put("3", "lucy");
		Set keySet=map.keySet();
		Iterator it =keySet.iterator();
		while (it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
