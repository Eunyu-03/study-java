package inheritanceTest;

//부모 클래스 선언
class Animal {
//	이름, 나이, 먹이를 저장할 용도?
	String name;
	int age;
	String feed;

//	기본 생성자(부모 클래스에 선언해 준다.)
	public Animal() {
		;
	}

//	
	public Animal(String name, int age, String feed) {
		super();
		this.name = name;
		this.age = age;
		this.feed = feed;
	}

	void walk() {
		System.out.println("걷기");
	}

	void run() {
		System.out.println("뛰기");
	}

	void eat() {
		System.out.println("먹기");
	}
}

class Lion extends Animal {
	public Lion() {
		;
	}

	@Override
	void walk() {
		System.out.print("네 발로 ");
		super.walk();
	}

	void hunt() {
		System.out.println("사냥하기");
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {

		Lion lion = new Lion();
		lion.walk();
	}
}
