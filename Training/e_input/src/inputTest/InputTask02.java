package inputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] arg) {
//		변수 선언 후 각 메세지 지정
		String message="두 개의 정수를 입력하세요: \n";
		String example="예시)2 5\n";
//		정수형 값을 입력받아야 하기 때문에 %d로 지정
		String format="%d + %d = %d";
//		정수1, 2, 연산 결과를 담을 변수 선언 및 초기화
		int jeongsu1=0;
		int jeongsu2=0;
		int result=0;
		
//		Scanner 세팅
		Scanner sc=new Scanner(System.in);
		
//		메세지 출력
		System.out.print(message+example);
//		공백을 기준으로 순서대로 입력받아 정수형으로 변수에 저장
		jeongsu1=Integer.parseInt(sc.next());
		jeongsu2=Integer.parseInt(sc.next());
		
//		연산 결과를 저장
		result=jeongsu1+jeongsu2;
		
//		결과 및 메세지 출력
		System.out.printf(format, jeongsu1, jeongsu2, result);
		
	}
}
