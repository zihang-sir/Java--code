package cn.dainzi.io;

import java.io.File;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("example.txt");
		System.out.println("文件名称:"+file.getName());
		System.out.println("文件的相对路径:"+file.getPath());
		System.out.println("文件的绝对路径:"+file.getAbsolutePath());
		System.out.println("文件的父路径:"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是文件":"不是文件");
		System.out.println(file.isDirectory()?"是目录":"不是目录");
		System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
		System.out.println("最后修改时间："+file.lastModified());
		System.out.println("文件大小："+file.length()+"bytes");
		System.out.println("是否成功删除"+file.delete());
	}

}
