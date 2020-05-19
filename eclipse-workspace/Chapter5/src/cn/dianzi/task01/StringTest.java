package cn.dianzi.task01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nbaernbatnbaynbauinbaopnba";
		String key="nba";
		String zzz="zzz";
		int count=getKeyStringCount(str,key);
		System.out.println("count="+count);
		int index=str.indexOf(zzz);
		System.out.println(index);

	}

	private static int getKeyStringCount(String str, String key) {
		// TODO Auto-generated method stub
		int count=0;
		if(!str.contains(key)) {
			return count;
		}
		int index=0;
		while((index=str.indexOf(key))!=-1) {
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}

}
