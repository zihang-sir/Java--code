package cn.dainzi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in=new FileInputStream("source/javaʵ��1.doc");
		OutputStream out=new FileOutputStream("target/javaʵ��1.doc");
		int len;
		long begintime=System.currentTimeMillis();
		while((len=in.read())!=-1) {
			out.write(len);
		}
		long endtime=System.currentTimeMillis();
		System.out.println("ʱ�䣺"+(endtime-begintime)+"����");
		in.close();
		out.close();
	}

}
