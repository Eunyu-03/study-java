package arrayTest;

import java.util.Scanner;

public class ArTask05 {
//  당신은 3칸 방이 있는 건물주이다.
//  각 방에는 세입자가 살고있다.
//  방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
	public static void main(String[] args) {
//		각 방의 월세를 담을 배열, 총합을 담을 변수, 평균을 담을 변수 선언
		int[] room=new int[3];
		int total=0;
		double average=0.0;
		
//		스캐너 세팅 및 월세 입력받기
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print(i+1+"번째 방의 월세를 입력하세요(단위:만 원): ");
			room[i]=sc.nextInt();
//		총 월세 구하기
			total+=room[i];
		}
//		평균 구하기
		average=(double)total/room.length;
		
//		출력
		System.out.println("총 월세는 "+total+"만 원,\n월세의 평균은"+String.format("%.2f", average)+"만 원입니다.");
	}
}
