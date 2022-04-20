package com.test01;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		WhileTest02 test = new WhileTest02();
		test.testDoWhile2();
	}
	public void testDoWhile() {
		int i = 11;
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		System.out.println("while 종류 후: " + i);
	}
	
	public void testDoWhile2() {
		//키보드로 영어 문자열을 입력 받아 출력
		//"end" 입력시 종류
		String str = null;
		Scanner sc = new Scanner(System.in);
		do {		
			System.out.print("문자열을 입력하시오 : ");
			str = sc.next();
			
			System.out.println("str : " + str);
		}while(str.equals("end")!=true); //참조형
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
