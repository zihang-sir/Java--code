package cn.dianzi.interfacedemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallPhone c=new CallPhone();
		c.call();
		SmartPhone s=new SmartPhone();
		s.call();
		Paid p=new Paid();
		p.call();
		p.text();
		p.play();
	}

}

