package ex03.io.escape;
public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total/3;
		
//		--------- 성적 출력 부분 ---------
		
		System.out.println("┌─────────────────────────┐");
		System.out.println("│       Score Output      │");
		System.out.println("└─────────────────────────┘");
		System.out.println("\t국어1: 0");
		System.out.println("\t국어2: 0");
		System.out.println("\t국어3: 0");
		System.out.println("\t총 점: 0");
		System.out.println("\t평 균: 0.00");
	}
}