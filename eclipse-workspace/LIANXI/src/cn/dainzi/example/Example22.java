package cn.dainzi.example;

public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=divide(4,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("捕获的异常信息为："+e.getMessage());
			return;      //结束当前语句，System.out.println("程序继续向下执行");不再执行
		}
		finally {
			System.out.println("进入finally代码块");//finally不受return影响
		}
		System.out.println("程序继续向下执行");
	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub
		int result=i/j;
		return result;
	}

}
