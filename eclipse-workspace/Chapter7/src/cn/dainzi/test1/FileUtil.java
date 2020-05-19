package cn.dainzi.test1;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {
	public static final String SEPARATE_FIELD=",";
	public static final String SEPARATE_LINE="\r\n";
	public static void saveBooks(Books books) {
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyyMMdd");
		String name="销售记录"+format.format(date)+".csv";
		InputStream in=null;
		try {
			in=new FileInputStream(name);
			if(in!=null) {
				in.close();
				createFile(name,true,books);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			createFile(name,false,books);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void createFile(String name, boolean label, Books books) {
		// TODO Auto-generated method stub
		BufferedOutputStream out=null;
		StringBuffer sbf=new StringBuffer();
		try {
			if(label) {
				out=new BufferedOutputStream(new FileOutputStream(name,true));
			}else {
				out=new BufferedOutputStream(new FileOutputStream(name));
				String[]fieldSort=new String[] {"图书编号","图书名称","购买数量","单价","总价","出版社"};
				for(String fieldKye:fieldSort) {
					sbf.append(fieldKye).append(SEPARATE_FIELD);
				}
				
			}
			sbf.append(SEPARATE_LINE);
			sbf.append(books.id).append(SEPARATE_FIELD);
			sbf.append(books.name).append(SEPARATE_FIELD);
			sbf.append(books.number).append(SEPARATE_FIELD);
			sbf.append((double)books.price).append(SEPARATE_FIELD);
			sbf.append((double)books.money).append(SEPARATE_FIELD);
			sbf.append(books.Publish).append(SEPARATE_FIELD);
			String str=sbf.toString();
			byte[]b=str.getBytes();
			for(int i=0;i<b.length;i++) {
				out.write(b[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
