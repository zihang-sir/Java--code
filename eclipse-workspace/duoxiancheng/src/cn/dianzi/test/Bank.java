package cn.dianzi.test;

public class Bank {
	private int sum;
	public void add (int num) {
		synchronized(this) {
			sum=sum+num;
			System.out.println("ÕË»§Óà¶îÎª£º"+sum);
		}
	}
}
