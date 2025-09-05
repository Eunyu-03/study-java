package arrayTest;

public class ArTask04 {
	public static void main(String[] args) {
//		1~100까지 중 홀수만 배열에 담기
		int[] arData1=new int[50];
		int[] arData2=new int[50];
		for(int i=0; i<50; i++) {
			arData1[i]=i*2+1;
			arData2[i]=(i+1)*2;
		}
		
		
//		두 배열을 합쳐서 1~100까지 배열에 담고 각 요소 출력하기
		int[] arResult1=new int[100];
		for(int i=0; i<50; i++) {
			arResult1[i*2]=arData1[i];
			arResult1[i*2+1]=arData2[i];
		}
		for(int i=0; i<100; i++) {
			System.out.println(arResult1[i]);
		}
	}
}
