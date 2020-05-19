package cn.dianzi.xctongbu;

public class Example11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow1 task=new TicketWindow1();
		new Thread(task,"窗口1").start();
		new Thread(task,"窗口2").start();
		new Thread(task,"窗口3").start();
		new Thread(task,"窗口4").start();
	}
}
class TicketWindow1 implements Runnable{
	private int tickets=10;
	Object lock=new Object();
	public void run() {
		while(true) {
			synchronized(lock) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
			}else {
				break;
			}
		}
		}
	}
}