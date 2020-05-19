package cn.itcast.chapter5;

public class Example08 {

	public static void main(String[] args) {
		System.out.println("1、添加---------------");
        add();
        System.out.println("2、删除---------------");
        remove();
        System.out.println("3、修改---------------");
        alter();
	}
	public static void add() {
		StringBuffer sb=new StringBuffer();//定义一个字符串缓冲区
		sb.append("abcdefg");
		System.out.println("append添加:"+sb);
		sb.insert(2, "123");//在指定位置添加字符串
		System.out.println("insert添加:"+sb);
	}
    public static void remove() {
    	StringBuffer sb=new StringBuffer("abcdefg");
    	sb.delete(1, 5);//指定范围清除
    	System.out.println("删除指定范围："+sb);
    	sb.deleteCharAt(2);//指定位置删除
    	System.out.println("删除指定位置："+sb);
    	sb.delete(0, sb.length());
    	System.out.println("清空缓冲区"+sb);
    }
    public static void alter() {
    	StringBuffer sb=new StringBuffer("abcdefg");
    	sb.setCharAt(1, 'p');//修改指定位置
    	System.out.println("修改指定位置："+sb);
    	sb.replace(1, 3, "qq");//替换指定位置字符或字符串 [1,3)左闭右开
    	System.out.println("替换指定位置字符（串）："+sb);
    	System.out.println("字符串翻转结果："+sb.reverse());
    }
}
