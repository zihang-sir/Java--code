package cn.dianzi.Example06;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread min=new Thread(new Task(),"优先级较低的线程");
		Thread max=new Thread(new Task(),"优先级较高的线程");
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		min.start();
		max.start();
	}

}
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出"+i);
		}
	}
	
}
