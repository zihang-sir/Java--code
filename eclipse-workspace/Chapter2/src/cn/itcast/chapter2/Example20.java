package cn.itcast.chapter2;

public class Example20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRectangle(3,5);
		printRectangle(2,4);
		printRectangle(6,10);

	}
	public static void printRectangle(int height ,int width) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

}
