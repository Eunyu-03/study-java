package stringTest;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
		
//		결과 담을 변수 선언
		String note1="";
//		문자열 입력받을 변수 선언
		String note2=null;
//		스캐너 세팅, 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("대소문자를 바꿀 문자열을 입력하세요: ");
		note2=sc.next();
		
//		요소 추출하여 담을 변수 선언
		char index=' ';
		
//		대문자 감지하여 소문자로 변환
		for(int i=0; i<note2.length(); i++) {
//		n번째 요소 추출
			index=note2.charAt(i);
//			대문자일 때
			if(64<index&&index<91) {
				index=(char)((int)note2.charAt(i)+32);
			}
//			소문자일 때
			else if(96<index&&index<123) {
				index=(char)((int)note2.charAt(i)-32);
			}
//			알파벳이 아닐 때
			else {
				index=note2.charAt(i);
			}
			note1+=index;
		}
		System.out.print(note1+"\n");
		
		
//		사용자에게 입력받은 문자열 중 소문자의 총 개수를 출력한다.
		
//		개수 담을 변수 선언
		int num1=0;
//		입력받을 문자열 변수 선언
		String note3=null;
		
//		스캐너 세팅 및 입력받기
		System.out.print("문자열을 입력하세요: ");
		Scanner scanner=new Scanner(System.in);
		note3=scanner.next();
		
		
//		소문자 판별
		for(int i=0; i<note3.length(); i++) {
//		문자열의 각 문자 담을 변수 선언
			int ch=(int)note3.charAt(i);
//			변수가 소문자의 아스키 코드 넘버 범위에 해당한다면 num1을 1씩 증가
			if(96<ch&&ch<123) {
				num1++;
			}
		}
//		결과 출력
		System.out.println("소문자의 개수는: "+num1);
		
		
//		아래의 주소애서 "/samsung"만 분리하여 출력한다
//		www.naver.com/baseball/samsung
		
//		주소를 담을 변수 선언 및 저장
		String address="www.naver.com/baseball/samsung";

//		마지막 /의 인덱스 알아내어 변수에 담기
		int index1=address.lastIndexOf('/');
//		분리한 글자 변수에 담기
		String samsung=address.substring(index1);
		
//		출력
		System.out.println(samsung);
		
		
		
		
	}
}
