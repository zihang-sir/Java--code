package cn.dainzi.Example09;

public class Example09 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread t=new Thread(new E(),"�߳�һ");
		t.start();
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"�����"+i);
			if(i==2) {
				t.join();
			}
			Thread.sleep(500);
		}
	}

}
class E implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"�����"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
