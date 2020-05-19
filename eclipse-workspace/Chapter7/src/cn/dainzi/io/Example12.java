package cn.dainzi.io;

import java.io.File;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\37721\\eclipse-workspace\\Chapter7");
		if(file.isDirectory()) {
			String[]names=file.list();
			for(String name:names) {
				System.out.println(name);
			}
			
		}
	}

}
