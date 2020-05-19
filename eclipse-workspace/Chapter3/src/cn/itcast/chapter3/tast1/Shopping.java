package cn.itcast.chapter3.tast1;

public class Shopping {
	public static void main(String[]arg) {
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		p1.setProName("电视机");
		p2.setProName("洗衣机");
		p3.setProName("豆浆机");
		p4.setProName("空调机");
		p5.setProName("吹风机");
		Market m=new Market();
		m.setMarketName("家乐福");
		m.setProductArr(new Product[] {p1,p2,p3,p4,p5});
		Person p=new Person();
		p.setName("小韩");
		Product result=p.shopping(m, "电视");
		
		if (result!=null) {
			System.out.println(p.getName()+"在"+m.getMarketName()+"买到了"+result.getProName());
			
		}else {
			System.out.println(p.getName()+"白跑了一趟，在"+m.getMarketName()+"什么都没买到");
		}
	}

}
