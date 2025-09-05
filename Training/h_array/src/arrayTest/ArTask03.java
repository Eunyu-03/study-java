package arrayTest;

import java.util.Scanner;

public class ArTask03 {
	public static void main(String[] args) {
		// 문제 1: 배열의 총합 구하기
		// 정수형 배열 int[] nums = {1, 2, 3, 4, 5}; 가 주어졌을 때,
		// 배열의 모든 요소를 더한 값을 출력하세요.
		
//		배열 선언 및 요소 저장, 결과를 저장할 변수 선언
		int[] arNum1= {1, 2, 3, 4, 5};
		int result1=0;
//		i번째 요소를 result에 더해가며 반복
		for(int i=0; i<5; i++) {
			result1+=arNum1[i];
		}
//		결과 출력
		System.out.println("배열의 총합은: "+result1);

		// 문제 2: 배열 뒤집기
		// 배열 int[] nums = {10, 20, 30, 40, 50}; 가 주어졌을 때,
		// 배열을 반대로 뒤집어 출력하세요.
		
//		배열 선언 및 값 지정
		int[] arNum2={10, 20, 30, 40, 50};
//		arNum.length-1번째부터 0번째까지 출력
		for(int i=arNum2.length-1; i>=0; i--) {
			System.out.println(arNum2[i]);
		}
		
		// 문제 3: 배열에서 최대값과 최소값 찾기
		// 사용자로부터 정수 5개를 입력받아 배열에 저장한 뒤,
		// 최대값과 최소값을 찾아 출력하세요.
		
//		입력받을 배열 선언
		int[] arNum3=new int[5];
//		차례대로 요소를 입력받아 배열에 저장
		for(int i=0; i<arNum3.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요: ");
			Scanner sc=new Scanner(System.in);
			arNum3[i]=sc.nextInt();
		}
//		최대값과 최소값을 저장할 변수 선언
		int max=arNum3[0];
		int min=arNum3[0];
//		최대값과 최소값 도출
		for(int i=1; i<arNum3.length; i++) {
			if(max<arNum3[i]) {
				max=arNum3[i];
			}
			if(min>arNum3[i]) {
				min=arNum3[i];
			}
		}
//		결과 출력
		System.out.println("최대값은 "+max+", 최소값은 "+min);
		
		// 문제 4: 중복 제거된 배열 출력
		// 정수 배열 int[] nums = {1, 2, 2, 3, 4, 4, 5}; 가 있을 때,
		// 중복을 제거한 배열을 출력하세요.

//		배열 선언 및 값 지정
		int[] arNum4= null;
//		중복되지 않는 요소 넣을 배열 선언
		int[] arNum5=null;
//		개수 입력받기
		Scanner scanner=new Scanner(System.in);
		System.out.print("입력을 원하는 수의 개수를 입력하세요: ");
		int gaesu=scanner.nextInt();
		arNum4=new int[gaesu];
//		수 입력받기
		System.out.print("중복을 제거할 수를 공백을 기준으로 나열해 입력해 주세요."
				+ "\n예) 2 5 74 2"
				+ "\n입력:");
//		입력받은 수 배열에 저장
		for(int i=0; i<gaesu; i++) {
			arNum4[i]=scanner.nextInt();
		}
			
//		중복인지 체크
		boolean[] arCheck=new boolean[arNum4.length];
//		길이-1 넣을 변수 지정
		int length=0;
//		arNum4 길이-arNum5길이
		int count=0;
		
//		중복 판단
		for(int i=0; i<arNum4.length-1; i++) {
//			재차 반복
			for (int j=i+1; j<arNum4.length; j++) {
//				j의 초기값은 i+1이므로 arNum[i]==arNum4[i+1]부터 시작해
//				arNum4[i]==arNum4[i+2], ... j가 1부터 arNum4.length보다 작을 때까지 반복
				if(arNum4[i]==arNum4[j]) {
//					같을 경우 길이의 차를 1씩 올림
					count++;
//					같은지 여부는 true
					arCheck[i]=true;
//					같으면 탈출
					break;
				}
//				i반복문으로 돌아가 j가 2부터 arNum4,length보다 작을 때까지 반복, ...
//				j가 arNum4.length-2일 때부터 arNum4.length-1까지 수행
			}
//			count에는 길이의 차, arCheck에는 arNum4[]의 해당 인덱스 값이 중복인지 여부가 담긴다
		}
//		5의 길이는 4-count
		arNum5=new int[arNum4.length-count];
//		0부터 체크의 길이보다 작을 때까지 반복
		for(int i=0; i<arCheck.length; i++) {
//			arCheck가 false일 때 실행
			if(!arCheck[i]) {
//				arNum5의 길이번째 요소는 arNum4의 i번째 요소, 실행 후 arNum5의 길이-1이 1 증가
				arNum5[length++]=arNum4[i];
			}
		}
//		arNum5 출력
		for(int i=0; i<arNum5.length; i++) {
			System.out.print(arNum5[i]+" ");
		}

	}
}
