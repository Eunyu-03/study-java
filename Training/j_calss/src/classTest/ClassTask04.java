package classTest;

// 동물 클래스 선언

// 변수
// 이름, 나이, 체력, 먹이 개수, 먹이 종류

// 메소드
// 먹기, 산책하기

// 먹기
// 체력 1증가, 먹이 개수 1감소

// 산책
// 체력 1감소

class Pet{
	String name;
	int age;
	int stamina;
	int numFood;
	String kindFood;
	
	public Pet(String name, int age, int stamina, int numFood, String kindFood) {
		this.name = name;
		this.age = age;
		this.stamina = stamina;
		this.numFood = numFood;
		this.kindFood = kindFood;
	}
	
	void eat() {
		stamina++;
		numFood--;
	}
	
	void walk() {
		stamina--;
	}
}

public class ClassTask04 {
	public static void main(String[] args) {
		Pet dog=new Pet("콩이", 1, 10, 5, "육포");
		
		dog.eat();
		dog.walk();
		
	}
}
