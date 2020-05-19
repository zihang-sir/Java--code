package cn.dainzi.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordBooksOrder {
	static ArrayList <Books>booksList=new ArrayList<Books>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		for(int i=0;i<booksList.size();i++) {
			System.out.println(booksList.get(i));
		}
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.print("������ͼ���ţ�");
			int bookId=scan.nextInt();
			Books stockBooks=getBooksById(bookId);
			if(stockBooks!=null) {
				System.out.println("��ǰͼ����Ϣ��"+stockBooks);
				System.out.print("�����빺��������");
				int bookNumber=scan.nextInt();
				if(bookNumber<=stockBooks.number) {
					Books books=new Books(stockBooks.id,stockBooks.name,stockBooks.price,bookNumber,stockBooks.price*bookNumber,stockBooks.Publish);
					FileUtil.saveBooks(books);
					stockBooks.setNumber(stockBooks.number-bookNumber);
				}else {
					System.out.println("��治��");
				}
			}else {
				System.out.println("ͼ���Ŵ���");
			}
		}
		
	}
	private static Books getBooksById(int bookId) {
		// TODO Auto-generated method stub
		for(int i=0;i<booksList.size();i++) {
			Books thisBooks=booksList.get(i);
			if(bookId==thisBooks.id) {
				return thisBooks;
			}
		}
		return null;
	}
	private static void init() {
		// TODO Auto-generated method stub
		Books good1=new Books(101,"Java����",44.50,100,4450.00,"�廪��ѧ������");
		Books good2=new Books(102,"Java˼��",108.00,50,5400.00,"��е��ҵ������");
		Books good3=new Books(103,"Java����",99.00,100,9900.00,"���ӹ�ҵ������");
		booksList.add(good1);
		booksList.add(good2);
		booksList.add(good3);
	}

}
