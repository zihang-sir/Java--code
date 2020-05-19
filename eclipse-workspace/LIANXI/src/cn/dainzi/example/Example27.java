package cn.dainzi.example;

public class Example27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=divide(4,-2);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static int divide(int i, int j) throws DivideByMinusException{
		// TODO Auto-generated method stub
		if(j<0) {
			throw new DivideByMinusException("除数是负数");
		}
		int result=i/j;
		return result;
	}

}
