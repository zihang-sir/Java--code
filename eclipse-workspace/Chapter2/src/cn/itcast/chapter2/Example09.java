package cn.itcast.chapter2;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade=75;
		if(grade>80) {
			System.out.println("该成绩等级为优");
		}else if(grade>70){
			System.out.println("该成绩等级为良");
		}else if(grade>60) {
			System.out.println("该成绩等级为中");
		}else {
			System.out.println("该成绩等级为差");
		}
	}

}
