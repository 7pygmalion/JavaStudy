package Ch03;

public class Operator03 {

	public static void main(String[] args) {
		// 비교연산
		int a = 3;
		int b = 5;
		
		System.out.println("a < b : " + (a<b));
		System.out.println("a > b : " + (a>b));
		System.out.println("a <= b : " + (a<=b));
		System.out.println("a >= b : " + (a>=b));
		System.out.println("a == b : " + (a==b));
		System.out.println("a != b : " + (a!=b));
		
		// 문자열비교
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");
		
		
		System.out.println("str1 == str2 : "+(str1 == str2));
		System.out.println("str1.equals(str2) : "+(str1.equals(str2)));
		
		//논리연산
		boolean t = true;
		boolean f = false;
		
		System.out.println("t && f : "+(t&&f));
		System.out.println("------------------------");
		System.out.println("t || f : "+(t||f));
		System.out.println("------------------------");
		System.out.println("!t : "+(!t));
		System.out.println("!f : "+(!f));
		
		// SCE => 불필요한 연산 제거
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = ((num1+=10) < 0)&&((num2+=10) > 0);
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2+"\n");

		result = ((num1+=10) > 0)||((num2+=10) < 0);
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2+"\n");

		// 삼항 연산
		double result2 = (num1 < num2)? num2 : num1;
		System.out.println(result2);
		
		int jumsu = 85;
		char grade;
		grade = 	(jumsu >= 90) ? 'A' : 
					(jumsu >= 80) ? 'B' : 
					(jumsu >= 70) ? 'c' : 
					(jumsu >= 60) ? 'D' : 'F';
		System.out.println("등급 : "+grade);
		
		//비트 연산
		int num01 = 3;
		int num02 = 5;
		System.out.println("num01 & num02 : "+(num01 & num02));
		System.out.println("num01 | num02 : "+(num01 | num02));
		System.out.println("num01 ^ num02 : "+(num01 ^ num02));
		System.out.println("~num01 : "+(~num01));

		num01 = 3;
		System.out.println("num01 << 1 : "+ (num01<<1));
		System.out.println("num01 << 2 : "+ (num01<<2));
		System.out.println("num01 << 3 : "+ (num01<<3));
		
		num02 = 24;
		System.out.println("num02 >> 1 : "+ (num02>>1));
		System.out.println("num02 >> 2 : "+ (num02>>2));
		System.out.println("num02 >> 3 : "+ (num02>>3));
		System.out.println("num02 >> 4 : "+ (num02>>4));


	}

}
