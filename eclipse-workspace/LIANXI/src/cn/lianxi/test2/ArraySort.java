package cn.lianxi.test2;

import java.util.Scanner;

public class ArraySort {
	int []arr=new int[6];
public  void input() {
	for (int i=0;i<6;i++) {
		Scanner sc=new Scanner(System.in);
		arr[i]=sc.nextInt();
	}
}
public  void print() {
	System.out.println("สýื้ฃบ");
	for(int i=0;i<6;i++) {
		System.out.print(" "+arr[i]);
	}
	System.out.println();
}
public  void sort() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<5-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
}
}