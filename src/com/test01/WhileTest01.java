package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		
		WhileTest01 test = new WhileTest01();
		test.testWhile4_1();
	
	}
	
	public void testWhile() {
		//�ʱ��
		int i = 0;
		
		while(i<8) {
			System.out.println((i+1) + "��° �ݺ��� ������...");
			i++;
		}
		System.out.println("while�� ������ ���� i ��: " + i);
	}
	
	public void testWhile2() {
		//���ڿ��� �Է¹޾� �ε������� ���� (char)�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();
		int index=0;
		while(index<str.length()) 
		{ 
			char ch =str.charAt(index);
			System.out.println((index+1)+ " : " + ch);
			index++;
		}
		sc.close();
	}
	
	public void testWhile3() {
		//1���� �Է¹��� �� ������ ���� ������
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		int i=1;
		while(i<=num) {
			sum+=i;
			i++;
		} 
		System.out.println("1���� " + num + "������ ���� "+ sum +" �Դϴ�.");
		sc.close();
	}
	
	public void testWhile4() {
		int i = 1;
		
		while(true) {
			System.out.println(i);
			i++;
			if(i==10) {
				break;
			}
		}
	}
	public void testWhile4_1() {
		//Ű����� ������ �Է¹޴´�.
		//�Է¹��� ���ڰ� 4�̸� while�� ����.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է�: ");
		while(true) {
			int num = sc.nextInt();
			if(num==4) {
				System.out.println("���ϴ� ���ڰ� "+ num +" �Դϴ�.");					
				break;
			}else {
				System.out.print(num +" �� ���ϴ� ���ڰ� �ƴմϴ�.\n���ڸ� �ٽ� �Է��ϼ���: ");					
			}
		}
		
		sc.close();
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
