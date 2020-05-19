package cn.dianzi.Example03;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mythread=new MyThread();
		Thread thread=new Thread(mythread);
		thread.start();
	    while(true) {
	    	System.out.println("Main方法正在运行");
	    }
	}

}
class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("MyThread类的run()方法正在运行");
		}
	}
}
