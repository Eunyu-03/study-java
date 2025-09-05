package inheritanceTest;

//부모 클래스 선언
class A {
	String name;
	int age;

//   메소드 A는 "부모 생성자"를 출력
	public A() {
		System.out.println("부모 생성자");
	}

//	이름과 나이를 입력받아 A 클래스의 변수에 저장
	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

//자식 클래스 선언
class B extends A {
	String gender;

//	메소드 B는 "자식 생성자" 출력
	public B() {
		System.out.println("자식 생성자");
	}

//	이름, 나이, 성별을 입력받아 성별은 B 클래스의 변수에 저장
//	이름, 나이는 A 클래스에 접근하여 해당 필드의 변수에 저장
	public B(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		B obj = new B("B", 20, "선택안함");
//      obj.name = "B";
		System.out.println(obj.name);
		A data=new A("정은유", 23);
		System.out.println(data.age);
		
	}

}
