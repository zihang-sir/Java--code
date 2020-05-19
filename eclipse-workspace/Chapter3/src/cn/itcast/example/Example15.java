package cn.itcast.example;
class Outer {
	private int num=4;
	public void test() {
		In in=new In();
		in.show();
	}
	class In{
		void show() {
			System.out.println("num="+num);//在内部类方法中访问外部类成员变量
		}
	}
}
public class Example15 {
	public static void main(String[]args) {
		Outer outer =new Outer();
		outer.test();
		Outer.In inter=new Outer().new In();//创建内部类对象
		inter.show();
	}
	

}
