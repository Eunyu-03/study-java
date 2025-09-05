package classTest;

/// 문제 1: 노래 플레이어 만들기
// Song 클래스를 만들어, 노래 제목(title), 가수(artist)를 저장하는 필드를 만든다.
// play() 메소드는 "노래 제목 - 가수 재생 중" 문장을 출력하게 한다.
// 다른 클래스에서 여러 개의 Song 객체를 만들어 play()를 호출하시오.

class Song {
	String title;
	String artist;

	Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	void play() {
		System.out.println(title + " - " + artist + " 재생 중");
	}
}

// 문제 2: 도서관 책 대출 시스템
// Book 클래스는 제목(title), 저자(author), 대출 여부(isBorrowed)를 필드로 가진다.
// borrow() 메소드는 책을 대출 상태로 바꾸고 "책이 대출되었습니다."를 출력한다.
// returnBook() 메소드는 책을 반납 상태로 바꾸고 "책이 반납되었습니다."를 출력한다.
// 다른 클래스에서 Book 객체를 만들어 대출과 반납 과정을 시뮬레이션하시오.

class Book {
	String title;
	String author;
	boolean isBorrowed;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	void borrow() {
		isBorrowed = true;
		System.out.println("책이 대출되었습니다.");
	}

	void returnBook() {
		isBorrowed = false;
		System.out.println("책이 반납되었습니다.");
	}
}

// 문제 3: 게임 캐릭터 체력 관리
// Character 클래스를 만들어 이름(name)과 체력(hp)을 필드로 선언한다.
// attack() 메소드는 상대 캐릭터의 체력을 10 감소시킨다.
// heal() 메소드는 자신의 체력을 5 회복시킨다.

class Character {
	String name;
	int hp;

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void attck(Character character) {
		character.hp-=10;
	}
	
	void heal() {
		hp+=5;
	}
}

public class ClassTask05 {
	public static void main(String[] args) {
		Song airplain = new Song("비행기", "거북이");
		Song darkside = new Song("darkside", "Bring me the horizon");
		Song mantra = new Song("mantra", "JENNI");
		Song atFirst = new Song("첫 눈에", "헤이즈");

		airplain.play();
		darkside.play();
		mantra.play();
		atFirst.play();

		Book demian = new Book("데미안", "헤르만 헤세");
		Book tree = new Book("나무", "베르나르 베르베르");
		Book murdOfMorg = new Book("모르그 가의 살인사건", "에드거 앨런 포");

		demian.borrow();
		tree.returnBook();
		murdOfMorg.borrow();
	}
}
