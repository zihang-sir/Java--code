package cn.lianxi.test;

import java.util.Scanner;

public class SwitchMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer ;
		System.out.println("������ѡ�");
		Scanner sc=new Scanner(System.in);
		answer=sc.next();
		switch(answer){
		case "A":
			System.out.println("�𰸴���");
			break;
		case "B":
			System.out.println("����ȷ");
			break;
		case "C":
			System.out.println("�𰸴���");
			break;
		case "D":
			System.out.println("�𰸴���");
			break;
		default:
			System.out.println("�����ڴ�ѡ��");
			break;
		}
	}

}
