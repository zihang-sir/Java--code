package cn.dianzi.interfacedemo;

public class CallPhone implements Plone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call by keyboard");
		}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("send text by keyboard");
	}


}
