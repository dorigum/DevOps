package ex0204.method;

import java.util.Scanner;

public class Exercise05_0204 {


class studyScore {
	//private int sum(); // 총점
	private int studyCount; // 과목 수
	private int avg; // 평균
	private String grade; // 등급
	
	// 총점 리턴 메소드 작성
	// 평균 리턴 메소드 작성
	// 등급 리턴 메소드 작성
}


class AAA {
	// 성적표 프로그램 ver2
}


// main----------------------------------------------------------------
	public static void main(String[] args) {
		boolean run = true; // 상태 변수 역할(반복문 실행 여부를 판단하는 변수)
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		// studyScore 클래스의 메소드들 호출
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. ❣성적표 구하기❣ |2. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");	
			
			
			String choiceNum = sc.nextLine();
			
			switch(choiceNum) {
				case "1" :
					System.out.print("국어 점수> ");
					kor = Integer.parseInt(sc.nextLine());
					
					System.out.print("영어 점수> ");
					eng = Integer.parseInt(sc.nextLine());
					
					System.out.print("수학 점수> ");
					math = Integer.parseInt(sc.nextLine());
					break;
				
				case "2" :
					run = false;
					break;
					
				default :
					System.out.println("1~2 사이의 숫자만 입력해주세요.");
			} // switch 종료
		} // while 종료
		System.out.println("프로그램을 종료합니다.");
	}
}