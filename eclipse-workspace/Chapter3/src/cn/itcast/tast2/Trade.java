package cn.itcast.tast2;

public class Trade {
	public static void main(String[]args) {
		Bank.bankName ="��������";
		Bank.welcome();
		Bank bank=new Bank("С��","654321",100.0);
		bank.deposit(500.0);
		bank.withdrawal("123456", 200.0);
		bank.withdrawal("654321", 1000.0);
		bank.withdrawal("654321", 200.0);
		Bank.welcomeNext();
	}

}
