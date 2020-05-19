package cn.dainzi.Example04;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicketWindow().start();
		new TicketWindow().start();//创建线程并起名，开启线程
		new TicketWindow().start();
		new TicketWindow().start();
		
	}

}
class TicketWindow extends Thread{
	private int tickets=100;
	public void run() {
		while(true) {
			if(tickets>0) {
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在发售第"+tickets--+"张票");
			}
		}
	}
}
