package cn.dianzi.Example06;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread min=new Thread(new Task(),"���ȼ��ϵ͵��߳�");
		Thread max=new Thread(new Task(),"���ȼ��ϸߵ��߳�");
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
			System.out.println(Thread.currentThread().getName()+"�������"+i);
		}
	}
	
}
