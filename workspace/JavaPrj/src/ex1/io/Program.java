package ex1.io;

public class Program {

	public static void main(String[] args) {
		System.out.write(3); // 출력해달라고 요청하지 않았으므로, 아무것도 출력되지 않음.
		
		System.out.write(51); // 코드값 51에 해당하는 3 출력
		
		System.out.write('3'); // 문자열 3에 해당하는 3 출력
		
		System.out.write('3' + 1); // 코드값 51+1 = 52 이므로, 코드값 52에 해당하는 값 4 출력
		System.out.write('4' + 1); // 코드값 52+1 = 53 이므로, 코드값 53에 해당하는 값 5 출력
		System.out.write('5' + 1); // 코드값 53+1 = 54 이므로, 코드값 54에 해당하는 값 6 출력
		System.out.write('6' + 1); // 코드값 54+1 = 55 이므로, 코드값 55에 해당하는 값 7 출력
		
		System.out.write('A' + 0); // A
		System.out.write('A' + 1); // B
		System.out.write('A' + 2); // C
		System.out.write('A' + 3); // D
		System.out.flush(); // 출력해달라고 요청.	
	}

}
