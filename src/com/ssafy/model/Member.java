package com.ssafy.model;

/*
 * <pre>
 * 회원 도메인 클래스
 * -- 설계 기법
 * 	1. abstraction(추상화)
 *	-- 주요 속성 추출 설계
 *	2. Encapsulation(은닉성)
 *	3. 생성자, 중복정의 
 *	4. toString():String 재정의(Overriding)
 *	
 *	--주요 속성
 *	1. 아이디  : String memberId   
 *	2. 비밀번호 : String memberPw
 *	3. 이름   : String name
 *	4. 휴대폰 : String mobile;
 *			>>(형식)
 *			>> 010-2222-2222: String
 *			>> 01012341234: String
 *	5. 이메일 : String email
 *
 *  @@소스코드 및 클래스 구성요소 선언 순서 
 *	1. package 선언문 
 *	2. import 선언문 
 *	3. class 선언문  
 *		(1) 멤버변수 선언문 
 *		(2) 생성자 선언문 
 *		(3) 멤버메서드 선언문
 * </pre>
 * @author 손민우
 */



public class Member {
	//(1) 멤버변수 선언문 : Encapsulation  적용 설계
	private String memberId;
	private String memberPw;
	private String name;
	private String mobile;
	private String email;
	
	//(2) 생성자 선언문: 기본생성자, 필수(아이디, 비밀번호, 이름), 전체(아이디, 비밀번호, 이름, 휴대폰, 이메일)
	//기본 생성자
	public Member() { 
		
	}
	//필수(아이디 비번 이름)
	public Member(String memberId, String memberPw, String name) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
	}
	
	//전체(아이디 비번 이름 휴대폰 이메일)
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		this(memberId, memberPw, name);
		this.mobile = mobile;
		this.email = email;
	}
	
	//(3) 멤버메서드 선언문
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMemberId() {
		return memberId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(memberId);
		builder.append(", ");
		builder.append(memberPw);
		builder.append(", ");
		builder.append(name);
		builder.append(", ");
		builder.append(mobile);
		builder.append(", ");
		builder.append(email);
		return builder.toString();
	}
}
