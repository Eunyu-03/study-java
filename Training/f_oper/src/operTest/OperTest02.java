package operTest;

import java.util.Scanner;

public class OperTest02 {

	public static void main(String[] args) {
		// 두 정수 입력받기
		int num1=0;
		int num2=0;
//		결과를 담을 변수 선언 및 초기화
		String result="";
		
//		스캐너 세팅
		Scanner sc=new Scanner(System.in);
		
//		메세지 출력 및 숫자 입력 받아 각 변수에 저장
		System.out.println("첫 번째 정수를 입력하세요: ");
		num1=sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요: ");
		num2=sc.nextInt();
		
//		두 변수에 지정된 값을 비교, num1이 큰 경우 결과 메세지 저장
		result= num1>num2?"더 큰 값: "+num1:
//			 동일할 경우 메세지 출력, 아닐 경우 num2가 더 크다고 결과 메세지 저장
			num1==num2?"두 수가 같습니다.":"더 큰 값: " + num2;
//		결과 메세지 출력
		System.out.println(result);
		
	}

}
