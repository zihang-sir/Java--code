package cn.dainzi.io;

import java.io.File;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("example.txt");
		System.out.println("�ļ�����:"+file.getName());
		System.out.println("�ļ������·��:"+file.getPath());
		System.out.println("�ļ��ľ���·��:"+file.getAbsolutePath());
		System.out.println("�ļ��ĸ�·��:"+file.getParent());
		System.out.println(file.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(file.canWrite()?"�ļ���д":"�ļ�����д");
		System.out.println(file.isFile()?"���ļ�":"�����ļ�");
		System.out.println(file.isDirectory()?"��Ŀ¼":"����Ŀ¼");
		System.out.println(file.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		System.out.println("����޸�ʱ�䣺"+file.lastModified());
		System.out.println("�ļ���С��"+file.length()+"bytes");
		System.out.println("�Ƿ�ɹ�ɾ��"+file.delete());
	}

}
