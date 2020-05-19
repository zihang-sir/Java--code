package cn.lianxi.test;

public class Main {
	public int add(int x,int y) {
		return x+y;
	}
	public double add(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z1;
		double z2;
		Main m=new Main();
		z1=m.add(3,4);
		z2=m.add(3.4, 3.1);
		System.out.println(z1);
		System.out.println(z2);
	}

}
