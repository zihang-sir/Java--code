package cn.dainzi.io;

import java.io.FileInputStream;

import java.io.IOException;

public class LiTi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("D:\\学习资料\\JAVA作业\\read1.txt");
		byte[]temp=new byte[1024];
		int i=0;
		int length;
		int content;
		while((content=in.read())!=-1) {
			temp[i++]=(byte) content;
		}
		in.read(temp);
		//while((length=in.read(temp))!=-1) {}
		System.out.println(new String(temp));
		in.close();
	}

}
