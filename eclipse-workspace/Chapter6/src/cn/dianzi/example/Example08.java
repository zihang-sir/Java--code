package cn.dianzi.example;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
	public int hashCode() {       //÷ÿ–¥hashCode(),equals()
		return id.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student stu=(Student) obj;
		boolean b=this.id.equals(stu.id);
		return b;
	}
}
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		Student stu1=new Student("1","jack");
		Student stu2=new Student("2","rose");
		Student stu3=new Student("2","rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}

}
