package cn.itcast.test02;

public class SendTask {
	private String number;
	private double goodsWeight;
	public SendTask() {
		
	}
	public SendTask(String number,double goodWeight) {
		this.number =number;
		this.goodsWeight =goodWeight;
	}
	//��ǰ׼��
	public void sendBefore() {
		System.out.println("������ʼ�����ֿ�����С�����");
		System.out.println("����������"+this.getGoodsWeight()+"kg");
		System.out.println("���������ϣ�");
		System.out.println("������װ��ϣ�");
		System.out.println("�˻�����֪ͨ��");
		System.out.println("��ݵ��ţ�"+this.getNumber());
	}
	//����
	public void send(Transportation t,GPS tool) {
		System.out.println("�˻���"+t.getAdmin()+"���ڼ�ʻ���Ϊ"+t.getNumber()+"��"+t.getModel()+"���ͻ���");
		t.transport();
		String showlacation=tool.showlocation();
		System.out.println("���ﵱǰ���꣺"+showlacation);
	}
	//�ͺ�
	public void sendAfter(Transportation t) {
		System.out.println("������������ɣ�");
		System.out.println("�˻���"+t.getAdmin()+"����ʻ�ı��Ϊ"+t.getNumber()+"��"+t.getModel()+"�ѹ黹");
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	

}
