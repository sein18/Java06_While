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
		System.out.println("while ���� ��: " + i);
	}
	
	public void testDoWhile2() {
		//Ű����� ���� ���ڿ��� �Է� �޾� ���
		//"end" �Է½� ����
		String str = null;
		Scanner sc = new Scanner(System.in);
		do {		
			System.out.print("���ڿ��� �Է��Ͻÿ� : ");
			str = sc.next();
			
			System.out.println("str : " + str);
		}while(str.equals("end")!=true); //������
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
