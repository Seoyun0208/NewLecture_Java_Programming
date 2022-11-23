package ex11.control5.for_example;

import java.util.Scanner;

// 1부터 10까지 더하기
public class Program {
	public static void main(String[] args) {
//		일반적인 풀이 방식
//		int total = 0;
//
//		for (int i = 0; i < 10; i++) {
//			total += i+1;
//		}
//		
//		System.out.printf("total is %d\n", total);

//		수학을 잘하는 경우 풀이 방식
		int total = (1 + 10) * 10 / 2;

		System.out.printf("total is %d\n", total);
	}
}