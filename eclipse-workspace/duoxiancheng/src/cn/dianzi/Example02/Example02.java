package cn.dianzi.Example02;

public class Example02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mythread=new MyThread();
		mythread.start();
	    while(true) {
	    	System.out.println("Main������������");
	    }
	}
}
class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("MyThread���run������������");
		}
	}
}


