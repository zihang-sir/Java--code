package cn.dianzi.example;

import java.util.LinkedList;
import java.util.Scanner;

public class KTVByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------欢迎来到点歌系统--------------");
		System.out.println("0.添加歌曲至列表");
		System.out.println("1.将歌曲置顶");
		System.out.println("2.将歌曲前移一位");
		System.out.println("3.退出");
		LinkedList list=new LinkedList();
		addMusic(list);
		while(true) {
			System.out.println("请输入要执行的序列号:");
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
				System.out.println("功能选择有误，请输入正确的序列号");
				break;
			}
			System.out.println("当前播放列表："+list);
		}
	}

	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("---------------退出----------------");
		System.out.println("您已退出系统");
		System.exit(0);
	}

	private static void setBefore(LinkedList list) {
		// TODO Auto-generated method stub
		System.out.println("请输入要至前的歌曲名：");
		String musicName=new Scanner(System.in).nextLine();
		int position=list.indexOf(musicName);
		if(position<0) {
			System.out.println("当前列表中没有输入的歌曲");
		}else if(position==0) {
			System.out.println("当前歌曲已在顶部");
		}else {
			list.remove(musicName);
			list.add(position-1, musicName);
		}
		System.out.println("已将歌曲"+musicName+"至前一位");
	}

	private static void settop(LinkedList list) {
		// TODO Auto-generated method stub
		System.out.println("请输入要置顶的歌曲名称：");
		String musicName=new Scanner(System.in).nextLine();
		int position=list.indexOf(musicName);
		if(position<0) {
			System.out.println("当前列表中没有输入的歌曲");
		}else {
			list.remove(musicName);
			list.addFirst(musicName);
		}
		System.out.println("已将歌曲"+musicName+"置顶");
	}

	private static void add(LinkedList list) {
		// TODO Auto-generated method stub
		System.out.println("请输入要添加的歌曲名称：");
		String musicName=new Scanner(System.in).nextLine();
		list.addLast(musicName);
		System.out.println("已添加："+musicName);
	}

	private static void addMusic(LinkedList list) {
		// TODO Auto-generated method stub
		list.add("稻香");
		list.add("夜曲");
		list.add("夜的第七章");
		list.add("听妈妈的话");
		list.add("龙卷风");
		System.out.println("初始歌曲列表："+list);
	}

}
