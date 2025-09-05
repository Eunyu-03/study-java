package inputTest;

import java.util.Scanner;

public class Inputtest02 {
	public static void main(String[] args) {
//		스캐너 세팅
		Scanner sc=new Scanner(System.in);
//		출력할 메세지, 입력 값 받을 변수 선언
		String message ="이름을 입력해 주세요: ";
		String name="";
		
//		메세지 출력 및 입력받은 이름 name에 저장
		System.out.println(message);
		name=sc.nextLine();
		
//		이름 출력
		System.out.println(name);
	}

}
