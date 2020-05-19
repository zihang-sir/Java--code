package cn.itcast.chapter5;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="String";
		String s2="Str";
		System.out.println("判断是否以Str开头："+s1.startsWith("Str"));
		System.out.println("判断是否以ng结尾："+s1.endsWith("ng"));
		System.out.println("判断是否包含tri："+s1.contains("tri"));
		System.out.println("判断是否为空："+s1.isEmpty());
		System.out.println("判断是否相等："+s1.equals(s2));
	}

}
