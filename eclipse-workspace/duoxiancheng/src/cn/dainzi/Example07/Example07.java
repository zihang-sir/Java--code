package cn.dainzi.Example07;

public class Example07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Thread(new Task()).start();
		for (int i=1;i<=10;i++) {
			if(i==5) {
				Thread.sleep(2000);
			}else {
				Thread.sleep(500);
			}
			System.out.println("main���߳��������:"+i);
		}
	}

}
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			try {
				if(i==3) {
					Thread.sleep(2000);
				}else {
					Thread.sleep(500);
				}
				System.out.println("�߳�һ�������");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}