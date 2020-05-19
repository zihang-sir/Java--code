package cn.dainzi.Example13;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLockThread d1=new DeadLockThread(true);
		DeadLockThread d2=new DeadLockThread(false);
		new Thread(d1,"Chinese").start();
		new Thread(d2,"American").start();
	}

}
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag){
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag) {
			while (true) {
				synchronized(chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized(knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
		}else {
			while (true) {
				synchronized(knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized(chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
					}
				}
			}
		}
	}
	
}