package cn.itcast.chapter5;

import java.util.Random;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(13);//��������ʱ��������
		for(int x=0;x<10;x++) {
			System.out.println(r.nextInt(100));
		}
	}

}
