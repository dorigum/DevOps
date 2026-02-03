package ex0203_구도연;

public class Exercise01 {

	public static void main(String[] args) {
		// 성적표 만들기
		// 국어, 영어, 수학 점수는 45~100 사이의 난수를 발생해서 저장
		// 경우의 수 = ((최대값 - 최소값 + 1)) + 최소값
		// A: 90~100 / B: 80~89 / C: 70~79 / D: 60~69 / F: 69 미만(디폴트)
		int kor = (int)(Math.random() * 56) + 45;
		int eng = (int)(Math.random() * 56) + 45;
		int math = (int)(Math.random() * 56) + 45;
		char grade;
		
		switch() {
			case : 
				grade = 'A';
				break;
				
			case :
				grade = 'B';
				break;
			
			case :
				break;
				
			default:
				grade = 'F';
				break;
		}
		System.out.println("결과: " + grade);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
	}
}
