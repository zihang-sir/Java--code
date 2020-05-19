package cn.dianzi.xctongbu;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow2 task=new TicketWindow2();
		new Thread(task,"����1").start();
		new Thread(task,"����2").start();
		new Thread(task,"����3").start();
		new Thread(task,"����4").start();
	}

}
class TicketWindow2 implements Runnable{
	private int tickets=10;
	
	public void run() {
		while(true) {
			sendTicket();
		}
	}
			

	public synchronized void sendTicket() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tickets>0) {
			System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
		}else {
			System.exit(0);
		}
	}
}
