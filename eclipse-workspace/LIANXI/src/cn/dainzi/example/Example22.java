package cn.dainzi.example;

public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=divide(4,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("������쳣��ϢΪ��"+e.getMessage());
			return;      //������ǰ��䣬System.out.println("�����������ִ��");����ִ��
		}
		finally {
			System.out.println("����finally�����");//finally����returnӰ��
		}
		System.out.println("�����������ִ��");
	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub
		int result=i/j;
		return result;
	}

}
