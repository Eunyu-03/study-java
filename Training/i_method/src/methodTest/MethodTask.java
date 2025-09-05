package methodTest;

import java.util.Scanner;

public class MethodTask {
//   1 ~ 10까지 println()으로 출력하는 메소드
	void printFrom1To10() {
//	   i가 1~10까지 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//   "홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int n) {
//	  홍길동 출력을 n번 반복
		for (int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}

//   이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int n) {
//	   name과 n을 입력받아 i가 0에서 n-1까지 반복 출력
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}

//   세 정수의 뺄셈 메소드
	int subtract(int number1, int number2, int number3) {
//	   return에 세 정수의 차 저장
		return number1 - number2 - number3;
	}

//	입력받은 정수들의 뺄셈 메소드
	int subtract(int[] arNumber) {
//		return시킬 결과 변수 선언
		int result = 0;

//		0번째 요소는 부호 바꾸기
		arNumber[0] *= -1;

//		i가 0부터 arNum의 길이-1까지 반복
		for (int i = 0; i < arNumber.length; i++) {
//			결과에서 i번째 arNum 요소 빼서 저장
			result -= arNumber[i];
		}
		return result;
	}

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
	int[] divide(int number1, int number2) {
		int[] arResult = new int[2];

		if (number2 != 0) {
			arResult[0] = number1 / number2;
			arResult[1] = number1 % number2;
			return arResult;
		}

		return null;
	}

//   1 ~ n까지의 합을 구해주는 메소드
	int getTotal(int n) {
//		결과 담을 변수 선언 및 초기화
		int result = 0;
//		i가 0~n-1까지 반복
		for (int i = 0; i < n; i++) {
//			결과에 i+1, 즉 1 2 3 4 ... 차례로 더해감
//			n을 더할 때까지 반복
			result += i + 1;
		}
		return result;
	}

//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeABC(String content) {
		
//		결과 변수 선언 및 초기화
		String result = "";

//		i가 0부터 content의 길이-1까지 반복
		for (int i = 0; i < content.length(); i++) {
//			content의 i번째 글자를 c에 넣기
			char c = content.charAt(i);

//			c가 대문자일 경우(아스키 코드 넘버 비교)
			if (c >= 97 && c <= 122) {
//				결과에 c를 소문자로 변환한 결과를 더한다
				result += (char) (c - 32);
			}
//			혹은 c가 소문자일 경우(아스키 코드 넘버 비교)
			else if (c >= 65 && c <= 90) {
//				결과에 c를 소문자로 변환한 결과를 더한다.
				result += (char) (c + 32);
			}
//			그 무엇도 아니면 결과에 c를 그대로 더한다.
			else {
				result += c;
			}
		}

		return result;
	}

//   한글을 정수로 바꿔주는 메소드
//   일공이사 -> 1024
	int changeToInteger(String data) {
//		바꿀 변수 선언
		String hangeul = "공일이삼사오육칠팔구";
		String temp = "";

//		i가 0에서 data의 길이-1일 때까지 반복
		for (int i = 0; i < data.length(); i++) {
//			temp에 data의 i번째 글자에 해당하는 숫자를 더한다.
//			(주의) int가 아닌 String으로 선언되었으므로 문자열이다.
			temp += hangeul.indexOf(data.charAt(i));
		}

		return Integer.parseInt(temp);
	}

//   정수를 한글로 바꿔주는 메소드
//   1024 -> 일공이사
	String changeToHangeul(int number) {
//		입력될 한글을 모은 변수, 바꿀 변수 선언
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";

//		number가 0이 되면 종료
		while (number != 0) {
//			hangeul의 number에서 10을 나눈 나머지(n의 자리 수)번째 글자를 결과에 더함
			result = hangeul.charAt(number % 10) + result;
//			10으로 나눈 몫만 남겨 제일 마지막 자리 수 날림
			number /= 10;
		}

		return result;
	}

//   문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//   입력 예) banana, a
//   출력 예) 3
	int getCount(String content, char c) {
//		몇 개 있는지 입력할 변수 선언
		int count = 0;
//		i가 0에서 content의 길이-1까지 반복
		for (int i = 0; i < content.length(); i++) {
//			content의 i번째 글자가 입력받은 글자와 동일할 때
			if (content.charAt(i) == c) {
//				count에 1씩 더함
				count++;
			}
		}
		return count;
	}

//   1~100을 입력받고 짝수만 리턴하는 메소드
	int[] getEven(int[] arData) {
//		짝수를 담을 배열 선언
		int[] arEven = new int[50];
//		i가 0에서 arEven의 길이-1까지 반복
		for (int i = 0; i < arEven.length; i++) {
//			arEven의 i번째 요소에 arData의 i 곱하기 2 더하기 1번째 값 대입
			arEven[i] = arData[i * 2 + 1];
		}
		return arEven;
	}

//   숙제
//   문제 5개 만들어서 풀어오기

	public static void main(String[] args) {
//      메소드 구현 테스트

		Scanner scanner = new Scanner(System.in);

		MethodTask methodTask = new MethodTask();
		methodTask.printFrom1To10();
		methodTask.printHong(10);

		String message = "이름: ";
		System.out.print(message);
		methodTask.printName(scanner.next(), 5);

		int[] arNumber = { 3, 4, 1 };
		int result = methodTask.subtract(arNumber);
		System.out.println(result);

		int[] arResult = methodTask.divide(10, 3);

		if (arResult == null) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println("몫: " + arResult[0]);
			System.out.println("나머지: " + arResult[1]);
		}

		int result1 = methodTask.getTotal(10);
		System.out.println(result1);

		String result2 = methodTask.changeABC("aBcDefff!@#!@#123");
		System.out.println(result2);

		int result3 = methodTask.changeToInteger("공공공공공공공일");
		System.out.println(result3);

		String data = methodTask.changeToHangeul(48125750);
		System.out.println(data);

		int count = methodTask.getCount("banana", 'z');
		System.out.println(count);

		int[] arData = new int[100];
		int[] arEven = null;

		for (int i = 0; i < arData.length; i++) {
			arData[i] = i + 1;
		}

		arEven = methodTask.getEven(arData);

		for (int i = 0; i < arEven.length; i++) {
			System.out.println(arEven[i]);
		}

	}
}














