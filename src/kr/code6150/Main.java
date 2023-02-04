package kr.code6150;

import kr.code6150.book.Book;
import kr.code6150.book.BookBuilder;
import kr.code6150.book.Novel;
import kr.code6150.book.Picture_Book;
import kr.code6150.lib.Library;
import kr.code6150.singleton.Singleton;

public class Main {

	//singleton -> ���α׷��󿡼� �� �ϳ��� �����ϴ� ��ü(instance)
	//builder -> ��ü ����� ���� �����ִ� ��ü
	
	public static void main(String[] args) {
		
		Book n1 = new Novel("�ƹ��̸�", "�ǹλ�", 10);
		Book p1 = new Picture_Book("�ƹ��̸�2", "�ǹλ�", 15);
		
		Book b = new BookBuilder(true)
				.setTitle("����")
				.setAuthor("ff")
				.setAmount(10)
				.build();
		
		String v = p1.getTitle();
		
		System.out.println("book ���� : " + n1.getTitle());
		
		Library l = Library.getInstasnce();
		
		l.addBook(p1);
		l.addBook(n1);
		
		//instanceof ��ü�� -> true/false
		// == �� �� -> true/false
		//.equals() ��ü(��) �� -> true/false
		System.out.println();
		
		l.printBookcount();
		
		System.out.println("=================================");
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.a = 20;
		
		System.out.println(s2.a);
	}
	
}
