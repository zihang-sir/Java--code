package cn.itcast.example;
class Outer {
	private int num=4;
	public void test() {
		In in=new In();
		in.show();
	}
	class In{
		void show() {
			System.out.println("num="+num);//���ڲ��෽���з����ⲿ���Ա����
		}
	}
}
public class Example15 {
	public static void main(String[]args) {
		Outer outer =new Outer();
		outer.test();
		Outer.In inter=new Outer().new In();//�����ڲ������
		inter.show();
	}
	

}
