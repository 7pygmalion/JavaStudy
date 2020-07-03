package Ch03;

public class Example01 {

	public static void main(String[] args) {
		// 가로가 3이고 세로가 6인 사각형의 넓이
		int w = 3;
		int h = 6;
		int square ;
		square = w * h ;
		System.out.println("1. 가로가 3이고 세로가 6인 사각형의 넓이 : " +square);
		System.out.println();
		// 위 길이의 삼각형의 넓이
		int tri;
		tri = square/2;
		System.out.println("2. 가로가 3이고 세로가 6인 삼각형의 넓이 : " +tri);
		System.out.println();

		// 성적이 40, 30, 10 나왔다 평균은?
		double score1 = 40;
		double score2 = 30;
		double score3 = 10;
		double avg;
		avg = (score1+score2+score3)/3;
		System.out.println("3. 성적이 40, 30, 10 나왔다 평균은? : "+avg);
		System.out.println();

		// 월급이 100원이다 연봉은? (세금 20프로 제외)
		int m = 100;
		m *= 12;
		m *= 0.8;
		System.out.println("4. 월급이 100원이다 연봉은? (세금 20프로 제외) : "+ m);
		System.out.println();

		// 286초를 분 초로 출력
		int time = 286;
		System.out.println("5. 286초를 분 초로 출력 : "+(time/60)+"분"+(time%60)+"초");
		System.out.println();
		//문제6
		int x= 10, y =5;
		boolean z;
		z = ((x>7) && (y<=5));
		System.out.println("6. (x>7) && (y<=5) : "+z);
		z = ((x%3 == 0)||(y%2 != 1));
		System.out.println("6. (x%3=0)||(y%2 != 1) : "+z);
		System.out.println();
		// 176840원을 화폐매수대로 출력
		int won = 176840;
        int m50000;
        int m10000;
        int m5000;
        int m1000;
        int m500;
        int m100;
        int m50;
        int m10;
        
        m50000 = won/50000;
        won %= 50000;
        m10000 = won/10000;
        won %= 10000;
        m5000 = won/5000;
        won %= 5000;
        m1000 = won/1000;
        won %= 1000;
        m500 = won/500;
        won %= 500;
        m100 = won/100;
        won %= 100;
        m50 = won/50;
        won %= 50;
        m10 = won/10;
        
        
		System.out.println("7. 176840원을 화폐매수대로 출력 : \n"+
                           "5만원권 : " + m50000 +"장" +"\n"+
                           "1만원권 : " + m10000 +"장" +"\n"+
                           "5천원권 : " + m5000 +"장" +"\n"+
                           "1천원권 : " + m1000 +"장" +"\n"+
                           "500원 : " + m500 +"개" +"\n"+
                           "100원 : " + m100 +"개" +"\n"+
                           "50원 : " + m50 +"개" +"\n"+
                           "10원 : " + m10 +"개");
		System.out.println();

        //8.점수에 따라 등급을 출력해보자
		int jumsu = 70;
		String grade;
		grade = (jumsu >= 90) ?  "A" :
				(jumsu >= 80) ?  "B" :
				(jumsu >= 70) ?  "C" :
				(jumsu >= 60) ?  "D" : "F" ;
		System.out.println("8. 내 점수는 : "+ grade);
		
        
				

	}

}
