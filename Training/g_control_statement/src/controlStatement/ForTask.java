package controlStatement;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
//		0~99까지 i+1을 100번 반복하여 출력
		for(int i=0; i<100; i++) {
			System.out.println(i+1);
		}
//		0~99까지 100-i를 100번 반복하여 출력
		for(int i=0; i<100; i++) {
			System.out.println(100-i);
		}
//		0~49까지 (i+1)*2를 50번 반복하여 출력
		for(int i=0; i<50; i++) {
			System.out.println((i+1)*2);
		}
		
//		i+1이 짝수일 때 i+1을 출력, 100번 반복
		for(int i=0; i<100; i++) {
			if((i+1)%2==0) {
				System.out.println(i+1);
			}
		}
//		합을 담을 j 선언
		int j=0;
//		j+i+1을 j에 담고 0~9까지 9번 반복
		for(int i=0; i<10; i++) {
			j+=i+1;
//			잘 들어가고 있는지 확인용 출력, 주석 처리함
//			System.out.println("i="+i+", j="+j);
		}
//		j의 값 출력
		System.out.println("1~10까지의 합: "+j);
		
//		입력받을 변수 선언
		int num1=0;
//		스캐너 세팅, 메세지 출력 후 num1에 수 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		num1=sc.nextInt();
		
//		num-1에서 1까지 num-1번 반복(기존에 num1값은 이미 들어가 있기 때문)
		for(int num2=num1-1; num2>0; num2--) {
//			num1에 num2(=num1-1)+기존 num1 담기
			num1+=num2;
//			확인용 출력, 주석 처리함
//			System.out.println("num1="+num1+", num2="+num2);
		}
		
//		1~num1까지의 합 출력
		System.out.println("1~입력한 수까지의 합: "+num1);
		
//		아스키 코드로 A는 65, 따라서 0~6까지 i+65를 5번 반복하려 출력
		for(int i=0; i<6; i++) {
			System.out.println((char)(i+65));
		}
		
//		A~F까지 중 C를 제외하고 아스키코드 넘버를 담을 변수 result 선언
		int result1=0;
//		0~4까지 5번 반복
		for(int i=0; i<5; i++) {
//			result가 2보다 작을 때(A, B) 65를 더하고 2보다 같거나 클 때(C, D, E) 65를 더하여 D, E, F의 아스키 코드를 담음
			result1=i<2?i+65:i+66;
//			문자로 형변환하여 출력
			System.out.println((char)result1);
		}
		
//		012301230123을 출력하기 위해 12번 반복
		for(int i=0; i<12; i++) {
//			4로 나누면 나머지가 0, 1, 2, 3 반복이므로 4로 나눈 나머지 값을 출력
			System.out.print(i%4+" ");
		}
//		가독성을 위해 한 줄 띄어 씀
		System.out.println("\n");
		
//		aBcDeF...Z 형태로 출력하기 위해 26번 반복
		for(int k=0; k<26; k++) {
//			아스키 코드 넘버를 담을 변수 선언
			int result2=0;
//			나머지가 0이라면(홀수, a c e등 소문자) 97을 더하고 나머지가 1이라면(짝수, B D F등 대문자) 65를 더하여 출력
			result2=k+(k%2==0?97:65);
			System.out.print((char)result2);
		}
	}

}
