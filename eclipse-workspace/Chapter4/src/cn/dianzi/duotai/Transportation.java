package cn.dianzi.duotai;

public class Transportation {
	private int num;
	private String name;
	public Transportation(String name,int num) {
		this.name=name;
		this.num=num;
	}
	public void zouQi() {
		System.out.println("��ͨ������"+name+",���ؿ�"+num+"��");
	}

}
