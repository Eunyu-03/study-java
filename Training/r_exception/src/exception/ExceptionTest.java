package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int number1=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("정수 한 개를 입력하세요:");
		number1=scanner.nextInt();
		
//		try {
//			number1=scanner.nextInt();
//		}
//		catch(InputMismatchException e) {
//			System.out.println("문자열을 입력하시면 안 됩니다");
//		} catch(Exception e) {
//			System.out.println("다시 시도해 주세요.");
//		}
		System.out.println(number1);
	}
}
