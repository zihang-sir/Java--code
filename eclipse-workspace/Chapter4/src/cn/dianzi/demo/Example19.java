package cn.dianzi.demo;
interface Animal19{
	void shout();
}
public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animalshout(new Animal19() {           //��������
			public  void shout() {
				System.out.println("����");
			}
		});
	}
	
	public static void animalshout(Animal19 an) {
		an.shout();
	}
}
