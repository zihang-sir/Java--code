package cn.dianzi.test;

public class SaveMoneyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}

}
