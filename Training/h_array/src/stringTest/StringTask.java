package stringTest;

public class StringTask {
	public static void main(String[] args) {
//		문자열 값 비교
		String data1="ABC";
		String data2="ABC";
		
//		문자열이 서로 같은지 판변
		System.out.println(data1.equals(data2));
		
//		배열 선언 및 값 지정 후 ", "을 기준으로 나뉜 각 정수를 요소로 하는 arData1 선언
		String data3="1, 2, 3, 4, 5";
		String[] arData1=data3.split(", ");
		for(int i=0; i<arData1.length; i++) {
//			출력하여 확인
			System.out.println(arData1[i]);
		}
		
		String data4="가 나 다 라 마 바 사";
		String[] arData2=data4.split(" ");
		for(int i=0; i<arData2.length; i++) {
			System.out.println(arData2[i]);
		}
		
		
//		아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력한다.
//		www.naver.com/baseball/samsung
//      www.naver.com/baseball/lg
//      www.naver.com/baseball/lotte
//      www.naver.com/baseball/kt
//      www.naver.com/phone/samsung
//   }
		
		//배열 선언 및 요소 입력
		String[] add= {"www.naver.com/baseball/samsung", "www.naver.com/baseball/lg", "www.naver.com/baseball/lotte", "www.naver.com/baseball/kt", "www.naver.com/phone/samsung"};
		//yoso에 i번째 요소 담기, index1에 마지막 /의 인덱스 번호 추출, ft에 index1번째 문자 다음부터 끝까지 담기
		for(int i=0; i<5; i++) {
			String yoso=add[i];
			int index1=yoso.lastIndexOf('/');
			String ft=yoso.substring(index1);
//			마지막 /부터 끝까지가 /samsung과 동일하다면 출력
			if(ft.equals("/samsung")) {
				System.out.println(yoso);
			}
		}
	}
}
