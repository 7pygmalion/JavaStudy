		// 교재 64p
public class Score {

	public static void main(String[] args) {
		// 국어점수 : 70
		int kor  = 70;
		// 영어점수 : 85
		int eng = 85;
		// 수학점수 : 90
		int math = 90;
		
		int sum = 0;
		sum = kor + eng + math;
		double avg = 0;
		avg = sum/3.0;
		
		System.out.println("총점 : "+ sum);
		System.out.printf("평균 : %f \n", avg);
		


	}

}
