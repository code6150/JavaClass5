package kr.code6150.book;

public class BookBuilder {

	private boolean isPictureBook;
	private String title;
	private String author;
	private int amount;
	
	public BookBuilder(boolean isPictureBook) {
		this.isPictureBook = isPictureBook;
	}
	
	// 객체의 생성을 도와주는 매소드가 존재하는데, 모든 메소드의 리턴값은 Builder로 한다.
	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}
	
	public BookBuilder setAmount(int amount) {
		this.amount = amount;
		return this;
	}
	
	//build 라는 매서드가 존재 -> 생성 할 객체를 리턴
	public Book build() {
		if(title == null) {
			throw new NullPointerException("제목이 존재하지 않습니다.");
		}
		if(author == null) {
			throw new NullPointerException("저자가 존재하지 않습니다.");
		}
		if(amount <= 0) {
			throw new NullPointerException("책이 0권 이하 입니다.");
		}
		if(isPictureBook) return new Picture_Book(title,author,amount);
		else return new Novel(title,author,amount);
	}
	
	
}
