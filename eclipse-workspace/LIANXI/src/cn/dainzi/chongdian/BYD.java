package cn.dainzi.chongdian;

public class BYD implements ECharge {
	String name;
	BYD(String name){
		this.name=name;
	}
	@Override
	public void startCharge() {
		// TODO Auto-generated method stub
		System.out.println(name+"开始充电了");
	}

	@Override
	public void endCharge() {
		// TODO Auto-generated method stub
		System.out.println(name+"结束充电了");
	}

}
