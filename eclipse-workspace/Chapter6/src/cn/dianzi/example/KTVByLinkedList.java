package cn.dianzi.example;

import java.util.LinkedList;
import java.util.Scanner;

public class KTVByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------��ӭ�������ϵͳ--------------");
		System.out.println("0.��Ӹ������б�");
		System.out.println("1.�������ö�");
		System.out.println("2.������ǰ��һλ");
		System.out.println("3.�˳�");
		LinkedList list=new LinkedList();
		addMusic(list);
		while(true) {
			System.out.println("������Ҫִ�е����к�:");
			Scanner sc=new Scanner(System.in);
			int command=sc.nextInt();
			switch(command) {
			case 0:
				add(list);
				break;
			case 1:
				settop(list);
				break;
			case 2:
				setBefore(list);
				break;
			case 3:
				exit();
				break;
			default:
				System.out.println("-----------------------");
				System.out.println("����ѡ��������������ȷ�����к�");
				break;
			}
			System.out.println("��ǰ�����б�"+list);
		}
	}

	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("---------------�˳�----------------");
		System.out.println("�����˳�ϵͳ");
		System.exit(0);
	}

	private static void setBefore(LinkedList list) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ��ǰ�ĸ�������");
		String musicName=new Scanner(System.in).nextLine();
		int position=list.indexOf(musicName);
		if(position<0) {
			System.out.println("��ǰ�б���û������ĸ���");
		}else if(position==0) {
			System.out.println("��ǰ�������ڶ���");
		}else {
			list.remove(musicName);
			list.add(position-1, musicName);
		}
		System.out.println("�ѽ�����"+musicName+"��ǰһλ");
	}

	private static void settop(LinkedList list) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�ö��ĸ������ƣ�");
		String musicName=new Scanner(System.in).nextLine();
		int position=list.indexOf(musicName);
		if(position<0) {
			System.out.println("��ǰ�б���û������ĸ���");
		}else {
			list.remove(musicName);
			list.addFirst(musicName);
		}
		System.out.println("�ѽ�����"+musicName+"�ö�");
	}

	private static void add(LinkedList list) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ��ӵĸ������ƣ�");
		String musicName=new Scanner(System.in).nextLine();
		list.addLast(musicName);
		System.out.println("����ӣ�"+musicName);
	}

	private static void addMusic(LinkedList list) {
		// TODO Auto-generated method stub
		list.add("����");
		list.add("ҹ��");
		list.add("ҹ�ĵ�����");
		list.add("������Ļ�");
		list.add("�����");
		System.out.println("��ʼ�����б�"+list);
	}

}
