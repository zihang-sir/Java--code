package cn.dianzi.damo;

public class Student {
	private String name;
	private int id;
	public  static String school="BJFU";
	private String favor;
	static {
		school="BJFU";
		System.out.println("��̬����鱻ִ����");
	}
	public Student() {}//Ĭ�Ϲ��캯��
	//���캯��1
	public Student(String name,int id) {
		this.id =id;
		this.name =name;
	}
	//���캯��2
	public Student(String name,int id,String favor) {
		this(name,id);
		this.favor =favor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	public String getFavor() {
		return favor;
	}
	public void setFavor(String favor) {
		this.favor = favor;
	}
	public void show() {
		System.out.println(this.name+"\t"+this.id+"\t"+this.favor);
	}
	

}
