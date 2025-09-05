package inputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] arg) {
//		변수 선언 및 반려동물의 이름과 나이를 묻는 문장 저장
		String petNameMessage="반려동물의 이름을 입력하세요: ";
		String petAgeMessage="반려동물의 나이를 입력하세요: ";
//		반려동물의 이름과 나이를 저장할 변수 선언 및 초기화
		String petName="";
		int petAge=0;
//		반려동물의 정보를 포함한 출력 문장을 담기 위한 변수 선언 및 초기화
		String result="";
		
//		sc라는 변수 생성하여 Scanner 세팅
		Scanner sc=new Scanner(System.in);
//		이름 묻는 문장 출력
		System.out.print(petNameMessage);
//		이름 입력받아 petName에 저장
		petName=sc.next();
//		나이 묻는 문장 출력
		System.out.print(petAgeMessage);
//		나이 입력받아 petAge에 저장.
		petAge=sc.nextInt();
		
//		System.out.println(petName);
//		System.out.println(petAge);
		
//		result에 반려동물의 이름과 나이, 출력할 메세지 저장
		result=petAge+"살의 "+petName+"! 건강하렴~";
//		출력
		System.out.println(result);
	}
}
