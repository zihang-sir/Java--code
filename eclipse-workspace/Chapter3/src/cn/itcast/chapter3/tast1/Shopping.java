package cn.itcast.chapter3.tast1;

public class Shopping {
	public static void main(String[]arg) {
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		p1.setProName("���ӻ�");
		p2.setProName("ϴ�»�");
		p3.setProName("������");
		p4.setProName("�յ���");
		p5.setProName("�����");
		Market m=new Market();
		m.setMarketName("���ָ�");
		m.setProductArr(new Product[] {p1,p2,p3,p4,p5});
		Person p=new Person();
		p.setName("С��");
		Product result=p.shopping(m, "����");
		
		if (result!=null) {
			System.out.println(p.getName()+"��"+m.getMarketName()+"����"+result.getProName());
			
		}else {
			System.out.println(p.getName()+"������һ�ˣ���"+m.getMarketName()+"ʲô��û��");
		}
	}

}
