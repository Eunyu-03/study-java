package inputTest;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt() 사용하기
		
//		변수 선언 및 메세지 지정
		String message="세 개의 정수 사이에 공백을 넣어 입력하세요.\n";
		String example="예시)2 6 8\n입력: ";
//		정수 셋을 담을 변수 선언 및 초기화
		int num1=0;
		int num2=0;
		int num3=0;
//		결과 메세지 지정
		String format="%d + %d + %d = %d";
//		결과값 변수 선언 및 초기화
		int result=0;
		
//		Scanner 세팅
		Scanner sc=new Scanner(System.in);
		
//		메세지 출력
		System.out.print(message);		
		System.out.print(example);
//		공백을 기준으로 세 정수 입력받아 변수에 저장
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
//		결과값 도출
		result=num1+num2+num3;
//		결과 메세지 출력
		System.out.printf(format, num1, num2, num3, result);
		
	}
}
