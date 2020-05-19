package cn.dianzi.student;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student();
		stu1.setName("mm");
		stu1.setAge(-1);
		stu1.speak();
		Student stu2=new Student(20,"nn");
		stu2.speak();
		Student stu3=new Student(3);
		stu3.speak();
	}

}
