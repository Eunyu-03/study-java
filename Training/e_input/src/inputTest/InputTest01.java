package inputTest;

import java.util.Scanner;

public class InputTest01 {
   public static void main(String[] args) {
//      이름을 입력받고 출력하기
	   
//	   메세지 변수 선언 및 지정, 이름을 담을 변수 선언 및 초기화
      String nameMessage = "이름: ";
      String name = "";
      
//      Scanner 세팅
      Scanner scanner = new Scanner(System.in);
      
//      메세지 출력
      System.out.println(nameMessage);
//      이름 입력받아 name에 저장
      name = scanner.next();
      
//      이름 출력
      System.out.println(name);
      
   }
}