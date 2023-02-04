package kr.code6150.lib;

import java.util.ArrayList;
import java.util.List;

import kr.code6150.book.Book;
import kr.code6150.book.Picture_Book;

public class Library {
	
	// Book (ComicBook,Novel)
	// List -> 추가, 삭제 ( 크기가 제한이 없다)
	// Array -> 정해진 크기 안에서만 데이터 저장, 삭제
	
	// List<타입> 이름;
	
	private static Library instance;
	public static Library getInstasnce() {
		if(instance == null) instance = new Library();
		return instance;
	}
	
	private List<Book> bookList;
	
	//Picture_Book b = new Picture_Book("", "");
	//Book n = new Nobel("","");
	
	private Library() {
		bookList = new ArrayList<Book>();
	}
	
	//메소드
	//접근제어자 리턴타입 이름(매개변수) { 코드; }
	
	//리턴 타입 : 해당 매소드를 실행 했을 때, 실행한 위치에 돌려줄 값에 대한 타입
	
	//메인에서 라이브러리에 책을 추가하고 싶음. -> 돌려줘야 할 값? x (void)
	//메인에서 라이브러리에 책을 추가하고 싶음.
	//단, 이미 등록 된 책은 등록하지 않는다. -> 돌려줘야 할 값 ? 추가 성공true / 실패false (Boolean)
	//함수 이름은 동사로 시작
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	//책이 몇 권 있는지 출력해주는 기능. -> void
	//만화책 : count 권
	//소설책 : list.size - count 권
	//총 합 : list.size 권
	public void printBookcount( ) {
		
		int count = 0;
		
		for(Book b : bookList) {
			if(b instanceof Picture_Book) {
				count++;
			}
		}
		
		System.out.println("만화책 : " + count + "권");
		System.out.println("소설책 : " + (bookList.size() - count) + "권");
		System.out.println("총 합 : " + bookList.size() + "권");

	}
	
	
}
