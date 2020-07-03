
public class Chapter01 {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		
		System.out.println(a);
		
		double b = 3.14;
		System.out.println(b);
		
		char c = 'A';
		System.out.println(c);
		
		boolean d = true; // false
		System.out.println(d);
		
		//int int = 10;
		double e = 12345.12;
		System.out.println(e);
		e = 1.234512e+4;
		System.out.println(e);
		
		// ���� => ������, 8����, 16����, 2����
		
		int f = 123;
		
		// 8���� 
		f = 0123;
		System.out.println(f);
		
		//16����
		f = 0x123;
		System.out.println(f);
		
		//2����
		f = 0b1010111001010101001;
		System.out.println(f);
		
		
		char g;
		g = 65;
		System.out.println(g);
		g = 'a';
		System.out.println(g);
		
		g = 0xAD0C;
		System.out.println(g);
		
		g = '꽥';
		System.out.println(g);
		
		//리터럴
		
		// 참조 타입
		String m = "Hello";
		System.out.println(m);
		

		
		byte p1 = 100;
		short p2 = p1;
		int p3 = p2;
		
		System.out.println(p1+":"+p2+":"+p3);
		
		double q1 = 100.0;
		float q2 = (float)q1;
		long q3 = (long)q2;
		int q4 = (int)q3;
		short q5 = (short)q4;
		byte q6 = (byte)q5;
		
		System.out.println(q1+":"+q2+":"+q3+":"+q4+":"+q5+":"+q6);
		
		int r1 = 300;
		byte r2 = (byte)r1;
		
		System.out.println("r2 :"+r2);
		
		
		
		
		
	}

}
