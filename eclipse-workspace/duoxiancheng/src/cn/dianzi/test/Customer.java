package cn.dianzi.test;

public class Customer implements Runnable{
	private Bank b=new Bank();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			b.add(100);
		}
	}
}
