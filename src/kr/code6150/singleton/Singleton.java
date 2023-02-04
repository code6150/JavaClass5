package kr.code6150.singleton;

// static
//		프로그램 시작시, 생성
//		프로그램 종료시, 소멸
	
//맴버변수
// 		객체 생성시, 생성
// 		객체 소멸시, 소멸

//지역, 매개 변수
//		호출시, 생성
// 		종료시, 소멸

public class Singleton {
	
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		
		return instance;
	}
	
	private Singleton() {}
	
	public int a;
	
	
}
