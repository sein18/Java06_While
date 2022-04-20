package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		WhileTest03 wt = new WhileTest03();
		
		//1~100 의 숫자를 역순으로 출력
		wt.prn01();
		//1~100 의 숫자 중, 2의 배수만 출력
		wt.prn02();
		//1~100 의 숫자 중, 7의 배수의 갯수와 총합 출력
		wt.prn03();
	}

	public void prn01() {
		int num = 100;
		while(num > 0) {
			System.out.println(num);
			num--;
			}
	}
	
	public void prn02() {
		int num = 1;
		while(num <= 100) {
			if(num % 2 == 0) {
				System.out.println(num);
				}
			num++;
		} 
	}

	public void prn03() {
		int num = 1;
		int sum = 0;
		int i = 0;
		while(num <= 100) {
			if(num %7 == 0) {
				i++;
				sum+=num;
				}
			num++;
			}
		System.out.printf("갯수 : %d\n총합 : %d ", i, sum);
			
		
	}
}
