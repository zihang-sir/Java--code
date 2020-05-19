package cn.itcast.chapter2;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[]args) {
		//随机生成0-9；
		int randomNumber=new Random().nextInt(10);
		System.out.println("随机数已经生成");
		System.out.println("----请输入您猜的数字----");
		Scanner sc=new Scanner(System.in);
		int enterNember=sc.nextInt();
		while(enterNember!=randomNumber) {
            if(enterNember>randomNumber) {
            	System.out.println("sorry,您猜大了");
            }
            else {
            	System.out.println("sorry,您猜小了");
                
            }
            System.out.println("----请输入您猜的数字----");
            enterNember=sc.nextInt();
            
            }
			System.out.println("恭喜您答对了");
	}
   
}
