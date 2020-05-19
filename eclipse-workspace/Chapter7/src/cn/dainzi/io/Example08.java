package cn.dainzi.io;

import java.io.FileWriter;
import java.io.IOException;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer=null;
		try {
			writer=new FileWriter("writer.txt");
			String str="ÄãºÃ£¬´«ÖÇ²¥¿Í";
			writer.write(str);
			writer.write("\r\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
