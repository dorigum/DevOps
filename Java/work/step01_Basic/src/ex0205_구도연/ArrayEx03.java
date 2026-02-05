package ex0205_구도연;

public class ArrayEx03 {

	public static void main(String[] args) {
		// [Chapter 05] p201 8번
		// 배열 항목의 전체 합과 평균을 구해서 출력
		// 중첩 for 문 이용
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88} // 행이 바뀔 때 마다 열이 2개씩 증가....
		};
		
		int sum = 0;
		for(int i=0; i<array.length-1; i++) { // 행
			for(int j=0; j<array[0].length-1; j++) { // 열
				//sum1 = array[0][0] + array[0][1];
				sum = array[0][j] + array[0][j+1];
				//sum2 = array[1][0] + array[1][1] + array[1][2];
				//sum3 = array[2][0] + array[2][1] + array[2][2] + array[2][3] + array[2][4];
			}
		}
		System.out.println(sum);
	}
}