package cn.itcast.example;

class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String stuName) {
		name=stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int stuAge) {
		if(stuAge<=0) {
			System.out.println("�Բ�������������䲻�Ϸ�������");
		}else {
			age=stuAge;
		}
	}
	public void introduce() {
		System.out.println("��Һã��ҽ�"+name+",�ҽ���"+age+"��");
	}
}
public class Example04 {
	public static void main(String[]args) {
		Student stu=new Student();
		stu.setAge(-30);     //�������䲻�Ϸ���ageδ����ֵ�����ǳ�ʼֵ0��
		stu.setName("��ǿ");
		stu.introduce();
	}

}
