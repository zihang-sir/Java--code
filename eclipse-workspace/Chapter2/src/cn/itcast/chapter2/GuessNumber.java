package cn.itcast.chapter2;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[]args) {
		//�������0-9��
		int randomNumber=new Random().nextInt(10);
		System.out.println("������Ѿ�����");
		System.out.println("----���������µ�����----");
		Scanner sc=new Scanner(System.in);
		int enterNember=sc.nextInt();
		while(enterNember!=randomNumber) {
            if(enterNember>randomNumber) {
            	System.out.println("sorry,���´���");
            }
            else {
            	System.out.println("sorry,����С��");
                
            }
            System.out.println("----���������µ�����----");
            enterNember=sc.nextInt();
            
            }
			System.out.println("��ϲ�������");
	}
   
}
