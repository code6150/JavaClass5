package kr.code6150.lib;

import java.util.ArrayList;
import java.util.List;

import kr.code6150.book.Book;
import kr.code6150.book.Picture_Book;

public class Library {
	
	// Book (ComicBook,Novel)
	// List -> �߰�, ���� ( ũ�Ⱑ ������ ����)
	// Array -> ������ ũ�� �ȿ����� ������ ����, ����
	
	// List<Ÿ��> �̸�;
	
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
	
	//�޼ҵ�
	//���������� ����Ÿ�� �̸�(�Ű�����) { �ڵ�; }
	
	//���� Ÿ�� : �ش� �żҵ带 ���� ���� ��, ������ ��ġ�� ������ ���� ���� Ÿ��
	
	//���ο��� ���̺귯���� å�� �߰��ϰ� ����. -> ������� �� ��? x (void)
	//���ο��� ���̺귯���� å�� �߰��ϰ� ����.
	//��, �̹� ��� �� å�� ������� �ʴ´�. -> ������� �� �� ? �߰� ����true / ����false (Boolean)
	//�Լ� �̸��� ����� ����
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	//å�� �� �� �ִ��� ������ִ� ���. -> void
	//��ȭå : count ��
	//�Ҽ�å : list.size - count ��
	//�� �� : list.size ��
	public void printBookcount( ) {
		
		int count = 0;
		
		for(Book b : bookList) {
			if(b instanceof Picture_Book) {
				count++;
			}
		}
		
		System.out.println("��ȭå : " + count + "��");
		System.out.println("�Ҽ�å : " + (bookList.size() - count) + "��");
		System.out.println("�� �� : " + bookList.size() + "��");

	}
	
	
}
