package kr.code6150.book;


public class Book {

	//private	-����
	//public	-��ü
	//protected	-���
	//(default)	-��Ű��
	
	private String title;
	private String author;
	private int amount;
	
	//������
	//���������� Ŭ������(�Ű�����) { �ڵ�; }
	public Book(String title, String author, int amount) {
		this.title = title;
		this.author = author;
		this.amount = amount;
	}
	
	// getter, setter
	// ���������� [public] get�ɹ������̸�(�Ű�����) {
	//		�ڵ�;
	//		return �ɹ�����;
	// }
	
	public String getTitle() {
		return title;
	}
	
}
