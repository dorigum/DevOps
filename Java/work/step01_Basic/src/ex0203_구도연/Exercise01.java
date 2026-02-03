package ex0203_구도연;

public class Exercise01 {

	public static void main(String[] args) {
		// 성적표 만들기
		// 이름(String), 국어 점수(int), 영어 점수(int), 수학 점수(int) 변수에 임의의 값 저장
		// 총점(int), 평균(double), 학점(char) 변수에 값 저장
		String name = "도연";
		int kor = 100;
		int eng = 50;
		int math = 70;
		
		int sum = (kor + eng + math);
		double avg = (kor + eng + math) / 3;
		// char grade = 'A';
		
		System.out.print("이름: " + name + ", ");
		System.out.print("국어 점수: " + kor + ", ");
		System.out.print("영어 점수: " + eng + ", ");
		System.out.print("총점: " + sum + ", ");
		System.out.print("평균: " + avg);
		// System.out.print(", " + "학점 : " + grade);
	}

}
