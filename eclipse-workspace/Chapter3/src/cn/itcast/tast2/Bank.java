package cn.itcast.tast2;
public class Bank {
	static String bankName;
	private String name;
	private String password;
	private double balance;   //���
	private double turnover;  //���׶�
	static void welcome () {
		System.out.println("��ӭ����"+bankName+"----------");
	}
	//����
	public Bank(String name,String password,double turnover) {
		this.name =name;
		this.password =password;
		this.turnover =turnover;
		this.balance =turnover-10;
		System.out.println(name+"�����ɹ����˻���� "+balance);
	}
	//���
	public void deposit(double turnover) {
		balance=balance+turnover;
		System.out.println(name+"���ã������˻� �Ѵ���"+turnover+"Ԫ,"+"��ǰ���"+balance+" Ԫ");
	}
	//ȡ��
	public void withdrawal(String password,double turnover) {
		if(this.password!=password) {
			System.out.println("��������������");
			return;
		}
		//�ж�����Ƿ����
		if (balance-turnover>0) {
			balance=balance-turnover;
			System.out.println(name+"���ã������˻� ��ȡ��"+turnover+"Ԫ��"+"��ǰ���"+balance+"Ԫ");
		}else {
			System.out.println("�Բ����˻�����");
		}
	}
	static void welcomeNext() {
		System.out.println("��Я������������ӭ�´ι���"+bankName+"-------------");
	}
}
