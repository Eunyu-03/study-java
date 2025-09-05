package arrayTest;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ArTask02 {
	public static void main(String[] args) {
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력
		
//		1~100까지 담을 배열 선언
		int[] arData1=new int[100];
//		짝수의 합을 담을 변수 선언
		int result1=0;
		
//		0번째 배열의 값은 1, 1번째 배열의 값은 2, ... 99번째 배열의 값은 100
		for(int i=0; i<100; i++) {
			arData1[i]=i+1;
//			짝수 i번째의 배열의 값은 홀수이므로 0을 더하고 홀수 i번째 배열의 값은 짝수이므로 변수에 더하여 담아 줌
			result1+=i%2==0?0:arData1[i];
		}
//		결과 출력
		System.out.println("1~100까지 짝수의 합은"+result1);
		
		
//      A ~ F까지 배열에 담고 출력
		
//		A~F까지 담을 배열 선언
		char[] arData2=new char[6];
		
//		i+65의 값을 문자로 강제 형변환 시키면 순서대로 A, B, ...가 된다
		for(int i=0; i<6; i++) {
//			배열에 A~F에 해당하는 아스키 코드 넘버 저장
			arData2[i]=(char)(i+65);
//			결과 출력
			System.out.print(arData2[i]+" ");
		}
//		가독성을 위해 한 줄 띄어 씀
		System.out.println("");

		
		//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
		
//		값을 담을 배열 선언
		char[] arData3=new char[5];
//		i+65를 한다 가정하였을 때 C에 해당하는 아스키 코드 넘버는 67, 그때 i의 값은 2
		for(int i=0; i<5; i++) {
//			따라서 i가 2보다 작을 때엔 65를 더하고 아닐 때엔 66을 더해 숫자가 C부터 하나씩 밀리도록 한다
			arData3[i]=i<2?(char)(i+65):(char)(i+66);
//			결과 출력
			System.out.print(arData3[i]+" ");
		}
		System.out.println("");
		
		
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		단, 같은 수는 없다고 가정
		
//		입력받을 배열 선언
		int[] arData4=new int[5];
		
//		최대값과 최소값 넣을 변수 선언
		int max=0;
		int min=0;
		
//		스캐너 세팅
		Scanner sc=new Scanner(System.in);
		System.out.println("다섯 개의 정수를 차례로 입력하세요.");
		//		입력받기
		for(int i=0; i<5; i++) {
			arData4[i]=sc.nextInt();
		}
		
//		최대값 최소값 임시 설정
		max=arData4[0];
		min=arData4[0];
		
//		최대값과 최소값 판별
		for(int i=0; i<4; i++) {
			if(max<arData4[i+1]) {
				max=arData4[i+1];
			}
//			System.out.println(max);
		}
		for(int i=0; i<4; i++) {
			if(min>arData4[i+1]) {
				min=arData4[i+1];
			}
//			System.out.println(min);
		}
		
//		결과 출력
		System.out.println("최대값: "+max+"\n최소값: "+min);
		
		
//		사용자에게 칸 수를 입력받고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
		
//		입력받을 변수, 배열, 합, 평균값을 담을 변수 선언
		int length=0;
		int[] arData5=null;
		double hap=0.0;
		double result2=0.0;
		
//		스캐너 세팅
		Scanner scanner=new Scanner(System.in);
		
//		입력받고 배열 선언
		System.out.print("칸 수를 입력하세요: ");
		length=scanner.nextInt();
		arData5=new int[length];
		
//		정수 입력받기
		System.out.print("칸 수만큼 정수를 입력하세요: ");
		for(int i=0; i<length; i++) {
			arData5[i]=scanner.nextInt();
//			정수들의 평균값 구하기
			hap+=arData5[i];
		}
		result2=hap/length;
		System.out.println("정수들의 평균은: "+result2);
	}
}
