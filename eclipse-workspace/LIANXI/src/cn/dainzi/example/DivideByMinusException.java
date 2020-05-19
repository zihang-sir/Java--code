package cn.dainzi.example;
//自定义异常
public class DivideByMinusException extends Exception{
	public  DivideByMinusException() {
		super();
	}
	public DivideByMinusException(String message) {
		super(message);
	}
}
