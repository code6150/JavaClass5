package kr.code6150.book;

public class Novel extends Book {

	public Novel(String title, String author, int amount) {
		//this -> 자기자신을 가르키는 참조 변수
		//super -> 부모 객체를 가르키는 참조변수
		super(title, author, amount);
		//부모 객체를 생성하는 생성자는 반드시 자식 객체의
		//생성 첫 부분에 위치해야 한다.
		
		
	}

}
