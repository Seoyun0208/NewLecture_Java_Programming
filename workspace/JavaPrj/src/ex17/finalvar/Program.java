package ex17.finalvar;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		final int SIZE = 3;
		int[] kors = new int[SIZE];
		int total = 0;
		float avg;
		int menu; // 1: INPUT, 2: PRINT, 3: EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;

		Scanner scan = new Scanner(System.in);

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
			case MENU_INPUT:
//		--------- 성적 입력 부분 ---------
				System.out.println("┌─────────────────────────┐");
				System.out.println("│       Score Input       │");
				System.out.println("└─────────────────────────┘");

				for (int i = 0; i < SIZE; i++) {
					do {
						System.out.printf("국어%d: ", i + 1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || 100 < kors[i]) {
							System.out.println("성적범위(0~100)를 벗어났습니다.");
						}
					} while (kors[i] < 0 || 100 < kors[i]);
				}

				System.out.println("───────────────────────────");
				break;

			case MENU_PRINT:
//		--------- 성적 출력 부분 ---------
				for (int i = 0; i < SIZE; i++) {
					total += kors[i];
				}

				avg = total / 3.0f;

				System.out.println("┌─────────────────────────┐");
				System.out.println("│       Score Output      │");
				System.out.println("└─────────────────────────┘");

				for (int n = 0; n < SIZE; n++) {
					System.out.printf("\t국어%d: %d\n", n + 1, kors[n]);
				}

				System.out.printf("\t총 점: %d\n", total);
				System.out.printf("\t평 균: %.2f\n", avg);

				System.out.println("───────────────────────────");
				break;

			case MENU_EXIT:
				break 종료;

			default:
				System.out.println("[입력 오류] 1~3 까지만 입력이 가능합니다.");
			}
		}
		System.out.println("시스템이 종료되었습니다.");
	}
}