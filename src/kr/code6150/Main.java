package kr.code6150;

import kr.code6150.book.Book;
import kr.code6150.book.BookBuilder;
import kr.code6150.book.Novel;
import kr.code6150.book.Picture_Book;
import kr.code6150.lib.Library;
import kr.code6150.singleton.Singleton;

public class Main {

	//singleton -> 프로그램상에서 단 하나만 존재하는 객체(instance)
	//builder -> 객체 만드는 것을 도와주는 객체
	
	public static void main(String[] args) {
		
		Book n1 = new Novel("아무이름", "권민상", 10);
		Book p1 = new Picture_Book("아무이름2", "권민상", 15);
		
		Book b = new BookBuilder(true)
				.setTitle("ㅎㅇ")
				.setAuthor("ff")
				.setAmount(10)
				.build();
		
		String v = p1.getTitle();
		
		System.out.println("book 제목 : " + n1.getTitle());
		
		Library l = Library.getInstasnce();
		
		l.addBook(p1);
		l.addBook(n1);
		
		//instanceof 객체비교 -> true/false
		// == 값 비교 -> true/false
		//.equals() 객체(값) 비교 -> true/false
		System.out.println();
		
		l.printBookcount();
		
		System.out.println("=================================");
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.a = 20;
		
		System.out.println(s2.a);
	}
	
}
