package cn.dianzi.student;

public class Student {
	String name;
	int age;
	static String school;
	static {
		school="北京林业大学";
		System.out.println(school);
	}
	public void speak() {
		System.out.println("姓名："+name);
		System.out.println("年龄:"+age);
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
			System.out.println("设置年龄不合法");
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
