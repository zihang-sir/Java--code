package cn.dainzi.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream out=new FileOutputStream("example.txt");
		String str="´«ÖÇ²¥¿Í";
		byte []b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			out.write(b[i]);
		}
		out.close();
	}

}
