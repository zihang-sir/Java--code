package cn.dainzi.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\学习资料\\JAVA作业\\read1.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\学习资料\\JAVA作业\\read2.txt"));
		int len;
		while ((len=bis.read())!=-1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
	}

}
