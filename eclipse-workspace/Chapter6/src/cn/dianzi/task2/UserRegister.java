package cn.dianzi.task2;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class UserRegister {
	public static HashSet<User>USER_DATA=new HashSet<User>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initData();
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String userName=sc.nextLine();
		System.out.print("请输入密码：");
		String password=sc.nextLine();
		System.out.print("请重复密码：");
		String repassword=sc.nextLine();
		System.out.print("请输入生日：");
		String birthday=sc.nextLine();
		System.out.print("请输入手机号：");
		String telNumber=sc.nextLine();
		System.out.print("请输入邮箱：");
		String email=sc.nextLine();
		CheckInfo checkinfo=new CheckInfo(USER_DATA);
		String result=checkinfo.checkAction(userName, password, repassword, birthday, telNumber, email);
		System.out.println("注册结果:"+result);
	}
	private static void initData() {
		// TODO Auto-generated method stub
		User user=new User("张正","zz,123",new Date(),"18810319240","zhangzheng@itcast.cn");
		User user2=new User("周琦","zq,123",new Date(),"18618121193","zhouqi@itcast.cn");
		USER_DATA.add(user);
		USER_DATA.add(user2);
	}

}
