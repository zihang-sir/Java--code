package cn.dianzi.middle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,5,6};
		int [] b= {5,6,7,8};
		//ArrayMiddle arr=new ArrayMiddle(b,a);
		//int result=arr.getUpMedian();
		//System.out.println("��λ���ǣ�"+result);
		ArrayFind arr=new ArrayFind(a,b);
		System.out.println(arr.findKth(a,b,9));
		
	}

}
