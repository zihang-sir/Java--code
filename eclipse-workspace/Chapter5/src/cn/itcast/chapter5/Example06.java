package cn.itcast.chapter5;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="��ë��-����-ƹ����";
		System.out.println("�ӵ�����ַ���ȡ��ĩβ�Ľ����"+str.substring(4));
		System.out.println("�ӵ�����ַ���ȡ���������Ľ��:"+str.substring(4, 6));//��ȡʱֻ������ʼ��������������
		System.out.print("�ָ����ַ���������Ԫ������Ϊ��");
		String[]strArray =str.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i!=strArray.length-1) {
				System.out.print(strArray[i]+",");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}

}
