package classTest;

import java.util.Scanner;

//문제 설명:

//사용자가 키우는 반려동물의 정보를 입력받고,
//반려동물들의 상태를 관리하는 간단한 프로그램을 만드세요.
//
//구현 조건:
//
//1. Pet 클래스 만들기
//- 필드: 이름, 나이, 체력, 종류
//- 메소드:
//  - feed(): 체력 +10 증가, "이름에게 밥을 주었습니다." 출력
//  - walk(): 체력 -5 감소, "이름과 산책을 했습니다." 출력
//  - printStatus(): "이름(종류) - 나이: n살, 체력: m" 형식으로 상태 출력

class PetSimulator {
	String name;
	int age;
	int hp;
	String type;

	public PetSimulator(String name, String age, String hp, String type) {
		super();
		this.name = name;
		this.age = Integer.parseInt(age);
		this.hp = Integer.parseInt(hp);
		this.type = type;
	}

	void feed() {
		hp += 10;
	}

	void walk() {
		hp -= 5;
	}

	void printStatus() {
		System.out.println(name + "(" + type + ") - 나이: " + age + "살, 체력: " + hp);
	}
}

public class ClassTask06 {
	public static void main(String[] args) {
		// 2. 메인 클래스(Main)에서 실행
		// - Scanner로 반려동물 3마리의 정보를 입력받아 Pet 객체 배열에 저장
		// - 반복문으로 각 Pet의 printStatus() 출력
		// - 사용자에게 선택지 제공:
		// 1. 밥 주기 (펫 번호 선택 후 feed())
		// 2. 산책하기 (펫 번호 선택 후 walk())
		// 3. 모두 상태 보기
		// 4. 종료
		//
		// 제어문(if/else 또는 switch), 반복문(while 또는 for), 배열, 메소드, 클래스 전부 사용할 것.
		Scanner sc = new Scanner(System.in);
		PetSimulator[] pets = new PetSimulator[3];
		int choice;
		for (int i = 0; i < pets.length; i++) {
			System.out.println((i + 1) + "번째 반려동물의 정보를 입력하세요.");
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			String age = sc.next();
			System.out.print("체력: ");
			String hp = sc.next();
			System.out.print("종류: ");
			String type = sc.next();

			pets[i] = new PetSimulator(name, age, hp, type);
		}
		System.out.println("각 반려동물의 정보입니다. ");
		for (int i = 0; i < pets.length; i++) {
			pets[i].printStatus();
		}

		System.out.print("번호를 입력하세요." + "\n1. 밥 주기" + "\n2. 산책하기" + "\n3. 모두 상태 보기" + "\n4. 종료" + "\n입력: ");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.print(
					"밥을 줄 반려동물을 선택하세요." + "\n1." + pets[0].name + "\n2. " + pets[1].name + "\n3. " + pets[3].name);
			pets[sc.nextInt()-1].feed();
		}
		else if(choice==2) {
			System.out.println("산책할 반려동물을 선택하세요." + "\n1." + pets[0].name + "\n2. " + pets[1].name + "\n3. " + pets[3].name);
			pets[sc.nextInt()-1].walk();
		}
	}

}
