package ex16.m_array;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {

//		9 대신 3*3 으로 쓰는 게 2개의 차원임을 쉽게 이해할 수 있으므로 굳이 연산해서 쓰지 말 것!
		int[][] kors = new int[3][3];
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				kors[j][i] = 0;
			}
		}

//		라벨을 통해 제어 구조를 벗어남! => switch 문 내에서는 'break 종료;' 와 같이 작성
		종료: while (true) {

//		--------- 메뉴 선택 부분 ---------
			System.out.println("┌─────────────────────────┐");
			System.out.println("│        Main Menu        │");
			System.out.println("└─────────────────────────┘");
			System.out.println("\t1. 성적입력");
			System.out.println("\t2. 성적출력");
			System.out.println("\t3. 종료");
			System.out.print("\t>");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
//		--------- 성적 입력 부분 ---------
				System.out.println("┌─────────────────────────┐");
				System.out.println("│       Score Input       │");
				System.out.println("└─────────────────────────┘");

				for (int j = 0; j < 3; j++) {
					for (int i = 0; i < 3; i++) {
						do {
							System.out.printf("%d학년 국어%d: ", j + 1, i + 1);
							kors[j][i] = scan.nextInt();
							if (kors[j][i] < 0 || 100 < kors[j][i]) {
								System.out.println("성적범위(0~100)를 벗어났습니다.");
							}
						} while (kors[j][i] < 0 || 100 < kors[j][i]);
					}
				}

				System.out.println("───────────────────────────");
				break;

			case 2:
//		--------- 성적 출력 부분 ---------
				System.out.println("┌─────────────────────────┐");
				System.out.println("│       Score Output      │");
				System.out.println("└─────────────────────────┘");
				
				for (int j = 0; j < 3; j++) {
					
					total = kors[j][0] + kors[j][1] + kors[j][2];

					avg = total / 3.0f;

						System.out.printf("-----<%d학년 국어성적>----------\n", j + 1);
						for (int i = 0; i < 3; i++) {
							System.out.printf("\t국어%d: %d\n", i + 1, kors[j][i]);
						}
						System.out.printf("\t총 점: %d\n", total);
						System.out.printf("\t평 균: %.2f\n", avg);

					System.out.println("───────────────────────────");
				}
				break;

			case 3:
				break 종료;

			default:
				System.out.println("[입력 오류] 1~3 까지만 입력이 가능합니다.");
			}
		}
		System.out.println("시스템이 종료되었습니다.");
	}
}