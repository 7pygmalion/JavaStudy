package Ch03;

public class Operation01 {

	public static void main(String[] args) {
		// 산술연산 사칙연산
		int a = 10;
		int b = 3;
		
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a/b = "+(((double)a)/b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a%b = "+(a%b));
		
		//산술연산 단항
		int c = 5;
		System.out.println("-c ="+(-c));
		
		// ++, --
		int d =7;
		System.out.println("d++ ="+ d++);
		System.out.println("d-- ="+ d--);
		
		int f = 10;
		int g = 20;
		int result = f++ * ++g;
		System.out.println("f :" +f);
		System.out.println("g :" +g);
		System.out.println("result :" +result);
		
		f = 10;
		g = 20;
		result = f-- * --g;
		System.out.println("f :" +f);
		System.out.println("g :" +g);
		System.out.println("result :" +result);
	}

}
