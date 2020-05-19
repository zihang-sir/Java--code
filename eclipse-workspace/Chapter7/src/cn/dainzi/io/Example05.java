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
		InputStream in=new FileInputStream("source/javaʵ��1.doc");
		OutputStream out=new FileOutputStream("target/javaʵ��1.doc");
		byte[]buff=new byte[1024*8];
		int len;
		long begin=System.currentTimeMillis();
		while ((len=in.read(buff))!=-1) {
			out.write(buff,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println("ʱ�䣺"+(end-begin)+"����");
		in.close();
		out.close();
	}

}
