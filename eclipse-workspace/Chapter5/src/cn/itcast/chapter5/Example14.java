package cn.itcast.chapter5;

public class Example14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		Process process=rt.exec("notepad.exe");
		Thread.sleep(3000);//������������
		process.destroy();//ɱ������
	}

}
