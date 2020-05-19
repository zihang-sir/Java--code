package cn.lianxi.test;

import java.util.Scanner;

public class SwitchMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer ;
		System.out.println("请输入选项：");
		Scanner sc=new Scanner(System.in);
		answer=sc.next();
		switch(answer){
		case "A":
			System.out.println("答案错误");
			break;
		case "B":
			System.out.println("答案正确");
			break;
		case "C":
			System.out.println("答案错误");
			break;
		case "D":
			System.out.println("答案错误");
			break;
		default:
			System.out.println("不存在此选项");
			break;
		}
	}

}
