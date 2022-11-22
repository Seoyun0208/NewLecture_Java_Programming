package ex6.operator;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
//		--------- 성적 입력 부분 ---------
		System.out.println("┌─────────────────────────┐");
		System.out.println("│       Score Input       │");
		System.out.println("└─────────────────────────┘");
		System.out.print("국어1: ");
		kor1 = scan.nextInt();
		
//		비교 연산자 예시
		System.out.println(0<= kor1 && kor1 <= 100 ? "올바른 값입니다." : "올바르지 않은 값입니다.");
		
		System.out.print("국어2: ");
		kor2 = scan.nextInt();
		System.out.print("국어3: ");
		kor3 = scan.nextInt();
		System.out.println("───────────────────────────");
		
//		--------- 성적 출력 부분 ---------
		total = kor1 + kor2 + kor3;
//		정수를 정수로 나누면 정수만 나오므로, 실수로 실수를 나누거나 형변환을 이용함!
		
		avg = (float)(total / 3.0); 
//		avg = total / 3.0f; 
		
		System.out.println("┌─────────────────────────┐");
		System.out.println("│       Score Output      │");
		System.out.println("└─────────────────────────┘");
		System.out.printf("\t국어1: %d\n", kor1);
		System.out.printf("\t국어2: %d\n", kor2);
		System.out.printf("\t국어3: %d\n", kor3);
		System.out.printf("\t총 점: %d\n", total);
		System.out.printf("\t평 균: %.2f\n", avg);
		System.out.println("───────────────────────────");
		
//		System.out.print(80);
//		System.out.write(80);
//		System.out.flush();
	}
}