package kr.code6150.book;

public class BookBuilder {

	private boolean isPictureBook;
	private String title;
	private String author;
	private int amount;
	
	public BookBuilder(boolean isPictureBook) {
		this.isPictureBook = isPictureBook;
	}
	
	// ��ü�� ������ �����ִ� �żҵ尡 �����ϴµ�, ��� �޼ҵ��� ���ϰ��� Builder�� �Ѵ�.
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
	
	//build ��� �ż��尡 ���� -> ���� �� ��ü�� ����
	public Book build() {
		if(title == null) {
			throw new NullPointerException("������ �������� �ʽ��ϴ�.");
		}
		if(author == null) {
			throw new NullPointerException("���ڰ� �������� �ʽ��ϴ�.");
		}
		if(amount <= 0) {
			throw new NullPointerException("å�� 0�� ���� �Դϴ�.");
		}
		if(isPictureBook) return new Picture_Book(title,author,amount);
		else return new Novel(title,author,amount);
	}
	
	
}
