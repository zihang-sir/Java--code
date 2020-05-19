package cn.itcast.chapter2;
import java.util.Random;
import java.util.Scanner;
public class CallName {
	public static void addStudentName(String[]students) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<students.length;i++) {
			System.out.println("存储第"+(i+1)+"个姓名：");
			students[i]=sc.next();
		}
	}
	public static void printStudentName(String[]students) {
		for(int i=0;i<students.length;i++) {
			String name=students[i];
			System.out.println("第"+(i+1)+"个同学姓名："+name);
		}
	}
	public static String randomStudentName(String[]students) {
		int index=new Random().nextInt(students.length);
		String name=students[index];
		return name;
	}
	public static void main(String[]args) {
		System.out.println("------随机点名器-------");
		String[]students=new String[3];
		addStudentName(students);
		printStudentName(students);
		String randomName=randomStudentName(students);
		System.out.println("被点到的同学是："+randomName);
	}

}
