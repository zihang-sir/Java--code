package cn.itcast.test02;

public class Ztransportation extends Transportation implements Careable{
	public Ztransportation() {
		
	}
	public Ztransportation(String number,String model,String admin) {
		super(number, model, admin);
	}

	public void upKeep() {
		// TODO Auto-generated method stub
		System.out.println("货物运输车辆保养完毕");
	}

	
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("运输进行中。。。");
	}
	

}
