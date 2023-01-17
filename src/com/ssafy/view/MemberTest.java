package com.ssafy.view;

import com.ssafy.model.Member;

/*
 * 회원관리시스템 테스트 시작클래스
 * @autor 손민우
 * @@5명의 회원정보
 *	## 5명의 회원정보
 *		"user01", "password01", "홍길동", "010-1234-1000", "user01@ssafy.com"
 *		"user02", "password02", "강감찬", "010-1234-2000", "user02@ssafy.com"    
 *		"user03", "password03", "이순신", "010-1234-3000", "user03@ssafy.com"    
 *		"user04", "password04", "김유신", "010-1234-4000", "user04@ssafy.com"    
 *		"user05", "password05", "유관순", "010-1234-5000", "user05@ssafy.com"         
 *
 */

public class MemberTest {
	public static void main(String[] args) {
		//5명의 회원 객체를 생성해 주세요: 모든 데이터 초기화 생성자 이용.
		Member m1 = new Member("user01", "password01", "홍길동", "010-1234-1000", "user01@ssafy.com");
		Member m2 = new Member("user02", "password02", "강감찬", "010-1234-2000", "user02@ssafy.com");
		Member m3 = new Member("user03", "password03", "이순신", "010-1234-3000", "user03@ssafy.com");
		Member m4 = new Member("user04", "password04", "김유신", "010-1234-4000", "user04@ssafy.com");
		Member m5 = new Member("user05", "password05", "유관순", "010-1234-5000", "user05@ssafy.com");
		
		//회원객체를 저장하기 위한 배열 객체 생성: 5명의 회원
		Member[] array = new Member[5];
		// 등록회원수 정보 및 신규등록하는 회원의 배열요소위치 인덱스
//		int index; // 지역변수는 자동 초기화가 발생하지 않음, 명시적 초기화하지 않고 사용하려면 오류발생!
		
		int index = 0; //지역변수
		
		System.out.println("---회원등록");
		array[index++] = m1; //후치 증감연산자를 이용해서 등록 후에 index를 1증가시킴.
		array[index++] = m2;
		array[index++] = m3;
		
		System.out.println("--- 현재 등록 회원수: "+ index);
		System.out.println("--- 현재 등록된 회원의 전체 정보 출력.");
		for(int i = 0; i < index; i++) {
			System.out.println(array[i]);// array[i] => Member => Member toString() 결과출력
		}
		
		System.out.println();
		for(Member m:array) {
			System.out.println(m);
		}
		
		// 인덱스 에러 
//		System.out.println();
//		System.out.println("--- 현재 등록된 회원의 전체 정보 출력.");
//		for(int i = 0; i < 10; i++) {
//			System.out.println(array[i]);// array[i] => Member => Member toString() 결과출력
//		}
//		
//		System.out.println("--- 정상종료 ---");
	}
}
