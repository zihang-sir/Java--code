package cn.dainzi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in=new FileInputStream("source/java实验1.doc");
		OutputStream out=new FileOutputStream("target/java实验1.doc");
		byte[]buff=new byte[1024*8];
		int len;
		long begin=System.currentTimeMillis();
		while ((len=in.read(buff))!=-1) {
			out.write(buff,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("时间："+(end-begin)+"毫秒");
		in.close();
		out.close();
	}

}
