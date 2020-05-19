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
		System.out.print("�������û�����");
		String userName=sc.nextLine();
		System.out.print("���������룺");
		String password=sc.nextLine();
		System.out.print("���ظ����룺");
		String repassword=sc.nextLine();
		System.out.print("���������գ�");
		String birthday=sc.nextLine();
		System.out.print("�������ֻ��ţ�");
		String telNumber=sc.nextLine();
		System.out.print("���������䣺");
		String email=sc.nextLine();
		CheckInfo checkinfo=new CheckInfo(USER_DATA);
		String result=checkinfo.checkAction(userName, password, repassword, birthday, telNumber, email);
		System.out.println("ע����:"+result);
	}
	private static void initData() {
		// TODO Auto-generated method stub
		User user=new User("����","zz,123",new Date(),"18810319240","zhangzheng@itcast.cn");
		User user2=new User("����","zq,123",new Date(),"18618121193","zhouqi@itcast.cn");
		USER_DATA.add(user);
		USER_DATA.add(user2);
	}

}
