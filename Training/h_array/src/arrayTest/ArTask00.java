package arrayTest;

public class ArTask00 {
	public static void main(String[] args) {
//		1~10까지 배열에 담고 출력
//		10~1까지 중 짝수만 배열에 담고 출력
//		1~100까지 배열에 담은 후 홀수만 출력
//		001.png~010.png를 배열에 담고 출력
		
		
//		1~10을 담을 배열 선언
		int[] arData1=new int[10];
//		i가 0~9까지 열 번 반복
		for(int i=0; i<10; i++) {
//			배열에 i번째 공간에 i+1 담기
			arData1[i]=i+1;
		}
//		i가 0~9까지 열 번 반복
		for(int i=0; i<10; i++) {
//			배열의 i번째 값 출력
			System.out.println(arData1[i]);
		}
		
//		10~1까지 짝수만 담을 배열 선언
		int[] arData2=new int[5];
//		i가 0~4까지 5번 반복
		for(int i=0; i<5; i++) {
//			(i+1)*에 해당하는 짝수 i번째 공간에 저장
			arData2[i]=(5-i)*2;
		}
//		i가 0~4까지 5번 반복
		for(int i=0;i<5; i++) {
//			배열의 i번째 값 출력
			System.out.println(arData2[i]);
		}
		
//		1~100까지 담을 배열 선언
		int[] arData3=new int[100];
//		0~99까지 100번 반복
		for(int i=0; i<100; i++) {
//			배열의 i번째 공간에 i+1 담기
			arData3[i]=i+1;
		}
//		0~49까지 50번 반복
		for(int i=0; i<50; i++) {
//			i*2번째 값(0번째는 1, 2번째는 3, ... 이므로 홀수) 출력
			System.out.println(arData3[i*2]);
		}

		
	}
}
