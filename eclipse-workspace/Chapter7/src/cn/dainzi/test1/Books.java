package cn.dainzi.test1;

public class Books {
	int id;
	String name;
	double price;
	int number;
	double money;
	String Publish;
	public Books(int id,String name,double price,int number,double money,String Publish) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.number=number;
		this.money=money;
		this.Publish=Publish;
	}
	public String toString() {
		String message="ͼ���ţ�"+id+" ͼ������"+name+" ������"+Publish+" ����"+price+" ��棺"+number;
		return message;
	}
	public void setNumber(int number) {
		this.number=number;
	}
}
