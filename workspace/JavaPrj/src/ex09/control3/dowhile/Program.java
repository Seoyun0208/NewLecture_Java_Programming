package ex09.control3.dowhile;

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

		while (true) {
//		--------- 성적 입력 부분 ---------
			System.out.println("┌─────────────────────────┐");
			System.out.println("│       Score Input       │");
			System.out.println("└─────────────────────────┘");

			do {
				System.out.print("국어1: ");
				kor1 = scan.nextInt();
				if (kor1 < 0 || 100 < kor1) {					
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			} while (kor1 < 0 || 100 < kor1);

			do {
				System.out.print("국어2: ");
				kor2 = scan.nextInt();
				if (kor2 < 0 || 100 < kor2) {					
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			} while (kor2 < 0 || 100 < kor2);

			do {
				System.out.print("국어3: ");
				kor3 = scan.nextInt();
				if (kor3 < 0 || 100 < kor3) {					
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				}
			} while (kor3 < 0 || 100 < kor3);

			System.out.println("───────────────────────────");

//		--------- 성적 출력 부분 ---------
			total = kor1 + kor2 + kor3;

			avg = (float) (total / 3.0);

			System.out.println("┌─────────────────────────┐");
			System.out.println("│       Score Output      │");
			System.out.println("└─────────────────────────┘");

			System.out.printf("\t국어1: %d\n", kor1);
			System.out.printf("\t국어2: %d\n", kor2);
			System.out.printf("\t국어3: %d\n", kor3);
			System.out.printf("\t총 점: %d\n", total);
			System.out.printf("\t평 균: %.2f\n", avg);

			System.out.println("───────────────────────────");
		}
	}
}