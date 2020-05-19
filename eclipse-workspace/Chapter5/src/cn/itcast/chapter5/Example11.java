package cn.itcast.chapter5;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]fromArray= {101,102,103,104,105,106};
		int[]toArray={201,202,203,204,205,206,207};
		System.arraycopy(fromArray, 2, toArray, 3, 4);
		for(int i=0;i<toArray.length;i++) {
			System.out.println(i+":"+toArray[i]);
		}
	}

}
