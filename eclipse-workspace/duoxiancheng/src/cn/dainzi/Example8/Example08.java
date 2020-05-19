package cn.dainzi.Example8;
class YieldThread extends Thread{
	public YieldThread (String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==3) {
				System.out.println("线程让步");
				Thread.yield();
			}
		}
	}
}
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new YieldThread("线程A");
		Thread t2=new YieldThread("线程B");
		t1.start();
		t2.start();
	}

}
