package ex4.io.printf;
public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
//		 정수를 정수로 나누면 정수만 나오므로, 실수로 실수를 나누거나 형변환을 이용함!
		avg = (float)(total / 3.0); 
//		avg = total / 3.0f; 
		
//		--------- 성적 출력 부분 ---------
		
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