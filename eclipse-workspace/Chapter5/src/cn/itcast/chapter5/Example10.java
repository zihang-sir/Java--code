package cn.itcast.chapter5;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		int sum=0;
		for(int i=0;i<10000000;i++) {
			sum+=i;
		}
		long end=System.currentTimeMillis();
		System.out.println("��������ʱ�䣺"+(end-start)+"����");
	}

}
