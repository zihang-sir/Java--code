package cn.dianzi.example;

import java.util.HashSet;

class Student09{
	private String id;
	private String name;
	public Student09 (String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
	public int hashCode() {
		return id.hashCode();//+name.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Student09)) {
			return false;
		}
		Student09 stu=(Student09)obj;
		boolean b=this.id.equals(stu.id);
		return b;
	}
}
public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		Student09 stu1=new Student09 ("1","jack");
		Student09 stu2=new Student09 ("2","rose");
		Student09 stu3=new Student09 ("2","luck");
		Student09 stu4=new Student09 ("3","rose");
		h.add(stu1);
		h.add(stu2);
		h.add(stu3);
		h.add(stu4);
		System.out.println(h);
	}

}
