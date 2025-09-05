package controlStatement;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
//		입력받은 값을 저장할 변수 선언
		int num=0;
//		출력할 메세지를 담을 변수 선언
		String message="";
//		결과 메세지를 담을 변수 선언
		String result="";
		
//		메세지 저장
		message="Q. 당신이 좋아하는 색을 선택하세요.\n"
				+ "1. 빨간색\n"
				+ "2. 노란색\n"
				+ "3. 검은색\n"
				+ "4. 흰색\n"
				+ "입력: ";
		
//		메세지 출력
		System.out.print(message);
		
//		스캐너 세팅 후 num에 입력받은 수 저장
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
//		결과 메세지 전 고정 메세지 출력
		System.out.println("\n ▶결과◀ ");
		
//		1일 때, 2일 때, 3일 때, 4일 때, 그 무엇도 아닐 때 각각의 결과 메세지 저장
		if(num==1) {
			result="빨간색 : 불같고 열정적이고 적극적이다.";
		}
		
		else if(num==2) {
			result="노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
		}
		
		else if(num==3) {
			result="검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		}
		
		else if(num==4) {
			result="흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		}
		
		else {
			result="잘못 입력하셨습니다.";
		}
		
//		결과 메세지 출력
		System.out.println(result);
		
	}

}
