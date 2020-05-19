package cn.dianzi.damo;

public class Stu {
	public static void main(String[]args) {
		Student monitor=new Student();
		System.out.println(monitor.getSchool());
		monitor.setName("LEEGEN");
		monitor.setFavor("wobajiangnanstyle");
		System.out.println(monitor.getName()+"\t"+monitor.getFavor());
		Student xueWei=new Student("cyd",05,"changtiao");
		xueWei.show();
	}

}
