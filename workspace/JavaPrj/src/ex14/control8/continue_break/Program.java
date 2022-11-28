package ex14.control8.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 space 로 구분하여 5개 이상 입력하세요: ");
		
		while(scan.hasNext()) {			
			n = scan.nextInt();
//			10 보다 작은 수는 건너뛴다.
			if (n < 10) continue;
//			200 보다 큰 수가 있으면 반복문을 벗어난다.
			if (n > 200) break;
			System.out.println(n);
		}
	}
}