package controlStatement;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
//		수를 담을 변수 두 개 선언 및 초기화
		int num1=0;
		int num2=0;
		
//		스캐너 세팅
		Scanner sc=new Scanner(System.in);
		
//		정수 둘 입력받기
		System.out.println("첫 번째 정수를 입력하세요: ");
		num1=sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요: ");
		num2=sc.nextInt();
		
//		num1이 num2보다 크다면 큰 값으로 num1 출력
		if(num1>num2) {
			System.out.println("큰 값: "+num1);
		}
		
//		num1이 num2보다 작다면 큰 값으로 num2 출력
		else if(num1<num2) {
			System.out.println("큰 값: "+num2);
		}
		
//		둘 다 아니라면 같다는 메세지 출력
		else {
			System.out.println("두 수가 같습니다.");
		}
		
	}

}
