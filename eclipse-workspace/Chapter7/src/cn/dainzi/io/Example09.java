package cn.dainzi.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			reader=new FileReader("reader.txt");
			br = new BufferedReader(reader);
			FileWriter writer=new FileWriter("des.txt");
			bw = new BufferedWriter(writer);
			String str;
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
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
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
