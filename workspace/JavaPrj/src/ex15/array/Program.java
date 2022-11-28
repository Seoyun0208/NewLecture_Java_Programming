package ex15.array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

//		int kor1, kor2, kor3;
		int[] kors = new int[3];
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);

//		kor1 = 0;
//		kor2 = 0;
//		kor3 = 0;

//		for (int i = 0; i < 3; i++) {
//			kors[i] = 0;
//		}

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

//				do {
//					System.out.print("국어1: ");
//					kor1 = scan.nextInt();
//					if (kor1 < 0 || 100 < kor1) {
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					}
//				} while (kor1 < 0 || 100 < kor1);
//
//				do {
//					System.out.print("국어2: ");
//					kor2 = scan.nextInt();
//					if (kor2 < 0 || 100 < kor2) {
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					}
//				} while (kor2 < 0 || 100 < kor2);
//
//				do {
//					System.out.print("국어3: ");
//					kor3 = scan.nextInt();
//					if (kor3 < 0 || 100 < kor3) {
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					}
//				} while (kor3 < 0 || 100 < kor3);

				for (int i = 0; i < 3; i++) {
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

			case 2:
//		--------- 성적 출력 부분 ---------
//				total = kor1 + kor2 + kor3;
				total = kors[0] + kors[1] + kors[2];

				avg = total / 3.0f;

				System.out.println("┌─────────────────────────┐");
				System.out.println("│       Score Output      │");
				System.out.println("└─────────────────────────┘");

				for (int n = 0; n < 3; n++) {
//				kor2, kor3 에는 어떻게 값을 저장할 수 있을지 생각해보기!
//					System.out.printf("\t국어%d: %d\n", n + 1, kor1);
					System.out.printf("\t국어%d: %d\n", n + 1, kors[n]);
				}

				System.out.printf("\t총 점: %d\n", total);
				System.out.printf("\t평 균: %.2f\n", avg);

				System.out.println("───────────────────────────");
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