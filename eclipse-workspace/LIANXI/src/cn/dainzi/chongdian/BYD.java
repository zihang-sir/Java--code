package cn.dainzi.chongdian;

public class BYD implements ECharge {
	String name;
	BYD(String name){
		this.name=name;
	}
	@Override
	public void startCharge() {
		// TODO Auto-generated method stub
		System.out.println(name+"��ʼ�����");
	}

	@Override
	public void endCharge() {
		// TODO Auto-generated method stub
		System.out.println(name+"���������");
	}

}
