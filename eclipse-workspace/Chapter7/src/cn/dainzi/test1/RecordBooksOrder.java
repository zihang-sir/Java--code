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
			System.out.print("请输入图书编号：");
			int bookId=scan.nextInt();
			Books stockBooks=getBooksById(bookId);
			if(stockBooks!=null) {
				System.out.println("当前图书信息："+stockBooks);
				System.out.print("请输入购买数量：");
				int bookNumber=scan.nextInt();
				if(bookNumber<=stockBooks.number) {
					Books books=new Books(stockBooks.id,stockBooks.name,stockBooks.price,bookNumber,stockBooks.price*bookNumber,stockBooks.Publish);
					FileUtil.saveBooks(books);
					stockBooks.setNumber(stockBooks.number-bookNumber);
				}else {
					System.out.println("库存不足");
				}
			}else {
				System.out.println("图书编号错误");
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
		Books good1=new Books(101,"Java基础",44.50,100,4450.00,"清华大学出版社");
		Books good2=new Books(102,"Java思想",108.00,50,5400.00,"机械工业出版社");
		Books good3=new Books(103,"Java讲义",99.00,100,9900.00,"电子工业出版社");
		booksList.add(good1);
		booksList.add(good2);
		booksList.add(good3);
	}

}
