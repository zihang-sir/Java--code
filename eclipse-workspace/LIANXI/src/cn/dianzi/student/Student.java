package cn.dianzi.student;

public class Student {
	String name;
	int age;
	static String school;
	static {
		school="������ҵ��ѧ";
		System.out.println(school);
	}
	public void speak() {
		System.out.println("������"+name);
		System.out.println("����:"+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("�������䲻�Ϸ�");
		}else
		{this.age=age;}
	}
	Student(){
		
	}
	Student(int age){
		this();
		this.age=age;
	}
	Student(int age,String name){
		this(age);
		this.name=name;
	}
}
