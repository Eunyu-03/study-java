package controlStatement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
//		스캐너 세팅
		Scanner sc = new Scanner(System.in);
//		타이틀 메세지 선언 후 저장
		String title = "Q. 당신이 좋아하는 색을 선택하세요.";
//		선택지 메세지 선언 후 저장
		String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
//		입력받은 값을 저장할 변수 선언
		int choice = 0;
//		각 결과 메세지 선언 후 저장
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "잘못 입력하셨습니다.";
//		최종 결과 메세지를 담을 변수 선언
		String resultMessage = "";
    
//    타이틀과 선택지 메세지 출력
		System.out.println(title);
		System.out.println(menu);
    
//		수 입력받기
		choice = sc.nextInt();
    
//		1일 경우, 2일 경우, 3일 경우, 4일 경우, 무엇도 아닐 경우 결과 메세지 담기
		switch(choice) {
		case 1:
			resultMessage=redMessage;
			break;
		case 2:
			resultMessage=yellowMessage;
			break;
		case 3:
			resultMessage=blackMessage;
			break;
		case 4:
			resultMessage=whiteMessage;
			break;
			default:
				resultMessage=errorMessage;
				break;
		}
		
//		최종 결과 메세지 출력
		System.out.println(resultMessage);
    	
//		boolean 형태의 변수 선언 및 값 지정
		boolean condition1 = false, condition2 = true;
		boolean condition3 = false, condition4 = true;
		
//		출력해 보기
		System.out.println(condition1);
		System.out.println(condition2);
		System.out.println(condition3);
		System.out.println(condition4);
    }

}
