package cn.itcast.test02;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendTask task=new SendTask("HYX600235",76.34);
		task.sendBefore();
		System.out.println("================");
		Ztransportation t=new Ztransportation("2025","´ó±¼","Ð¡º«");
		Phone p=new Phone();
		task.send(t, p);
		System.out.println("================");
		task.sendAfter(t);
		t.upKeep();

	}

}
