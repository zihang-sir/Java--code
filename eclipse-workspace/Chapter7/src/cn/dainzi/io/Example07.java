package cn.dainzi.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		try {
			reader = new FileReader("reader.txt");
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.println((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
