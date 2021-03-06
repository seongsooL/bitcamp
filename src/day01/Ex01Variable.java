package day01;
// 주석(Comment)
// 주석이란, 우리가 코딩할 클래스에 입력하는 글자들이지만
// 실제로 클래스가 프로그램으로 변환될 때에는 무시가 되는 글자들이다.
// 해당 프로그램에 설명을 적을때 사용한다.

// 주석에는 한줄 주석과 여러줄 주석이 있는데
// 한줄 주석은 // 입력하면 거기서부터 그 줄이 끝날때까지는 모두 주석이 된다.

// 여러줄 주석은 /* 로 시작해서  */가 나올때까지 그 사이의 모든 줄은 주석이 된다.
/*
 * 요렇게
 * 다 주석이
 * 된다
 */

// 변수(variable)
// 변수란 그 안의 값이 바뀔 수 있는 공간을 변수라고 한다.
// 변수는 우리가 그 안에 어떤 종류의 값이 저장될지를 지정해야하고
// 그 공간의 이름을 정해주어야 불러서 그 공간의 값을 바꾸거나 호출할 수 있다.

// 또한 변수를 사용하기 위해서는 무조건 한번은 초기화(할당)을 해주어야 한다.

// 변수가 가질 수 있는 값의 종류와 이름을 지정하는 것을 '선언'이라고 하고
// 맨 처음 값을 넣는 것을 초기화 라고 한다.

// 변수의 선언방법
// 데이터타입 변수이름
// 데이터타입: 해당 공간이 가질 값의 종류
//
// 변수의 초기화(할당)
// 변수이름 = 값;

// 상수란?
// 상수란 한번 값이 초기화가 되면
// 더이상 값을 변화시킬 수 없는 공간을 상수라고 한다.
// 상수는 변수처럼 선언하지만
// 가장 앞에
// final 데이터타입 상수이름 으로 선언한다.

// 데이터타입
// 데이터타입은 크게 2가지로 나뉜다.
// 1. 기본형
//	  기본형의 경우 해당 공간에 2진법으로 변환된 값이 직접 저장이 되어있다.
//	  기본형에는 다음과 같은 자료형들이 존재하낟.
//	  정수형: byte short int long
//	  실수형: float double
//	  문자형: char
// 	  논리형: boolean

// 2. 참조형
//	  참조형의 경우 해당 공간에 주소값이 존재하고 그 주소값을 '참조'하여
//	  실제 값이 존재하는 곳을 찾아 들어가야 어떤 값이 있는지 확인 가능하다.
// 	  참조형에는 다음과 같은 자료형들이 존재한다.
//	  클래스형, 인터페이스형, 배열형

public class Ex01Variable {
	public static void main(String[] args) {
		//기본형 데이터타입 변수 선언하기
		int number;
		//number의 값 초기화하기
		number = 4;
		
		System.out.println("number의 현재값:" + number);
		
		//number는 변수이기 때문에
		//우리가 int의 값이면 마음껏 값을 바꿔줄 수 있다.
		number = 23;
		System.out.println("number의 현재값:" + number);
		
		//단, 우리가 지정한 데이터타입과 다른 값을 넣어줄 수 없다.
		//넣을려고 하면 에러가 난다.
		//number = 3.141592;
		
		//number = "안녕하세요";
		
		//상수 선언하기
		final int NUMBER;
		
		//상수에 값 초기화하기
		NUMBER = 4;
		System.out.println("NUMBER의 현재값:" + NUMBER);
		
		//상수는 한번 값이 저장되면 더이상 다른 값으로 바꿔줄 수 없다!
		//NUMBER = 20;
	}
}
