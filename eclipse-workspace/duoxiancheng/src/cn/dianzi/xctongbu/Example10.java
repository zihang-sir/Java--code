package cn.dianzi.xctongbu;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow task=new TicketWindow();
		new Thread(task,"����1").start();
		new Thread(task,"����2").start();
		new Thread(task,"����3").start();
		new Thread(task,"����4").start();
	}

}
class TicketWindow implements Runnable{
	private int tickets=10;
	public void run() {
		while(tickets>0) {
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
			
		}
	}
}