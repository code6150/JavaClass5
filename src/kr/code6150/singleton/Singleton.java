package kr.code6150.singleton;

// static
//		���α׷� ���۽�, ����
//		���α׷� �����, �Ҹ�
	
//�ɹ�����
// 		��ü ������, ����
// 		��ü �Ҹ��, �Ҹ�

//����, �Ű� ����
//		ȣ���, ����
// 		�����, �Ҹ�

public class Singleton {
	
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		
		return instance;
	}
	
	private Singleton() {}
	
	public int a;
	
	
}
