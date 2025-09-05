package operTest;

public class OperTest01 {

	public static void main(String[] args) {
		
//		boolean 형태의 자료형 선언 및 지정
		boolean isTrue=10==11;
		boolean result= isTrue&&10<=20;
		
//		출력하여 참과 거짓이 어떻게 저장되는지 확인
		System.out.println(10 == 11);
		System.out.println(10>3);
//		출력하여 어떤 결과가 담겼는지 확인
		System.out.println(isTrue);
		System.out.println(result);
		
//		isTrue && 10<=20의 결과를 true가 나오도록 변경하기
		
//		AND 연산, NOT 사용하여 boolean 형태의 변수 선언
		boolean result2=!isTrue&&10<=20;
//		출력하여 결과 확인
		System.out.println(result2);
		
	}

}
