package kr.code6150.book;


public class Book {

	//private	-내부
	//public	-전체
	//protected	-상속
	//(default)	-패키지
	
	private String title;
	private String author;
	private int amount;
	
	//생성자
	//접근제어자 클래스명(매개변수) { 코드; }
	public Book(String title, String author, int amount) {
		this.title = title;
		this.author = author;
		this.amount = amount;
	}
	
	// getter, setter
	// 접근제어자 [public] get맴버변수이름(매개변수) {
	//		코드;
	//		return 맴버변수;
	// }
	
	public String getTitle() {
		return title;
	}
	
}
