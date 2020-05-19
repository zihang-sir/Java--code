package cn.dianzi.Example01;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mythread=new MyThread();
		mythread.run();
	    while(true) {
	    	System.out.println("Main方法正在运行");
	    }
	}
}
class MyThread{
	public void run() {
		while(true) {
			System.out.println("MyThread类的run方法正在运行");
		}
	}
}
