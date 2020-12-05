package sec02.exam08;

public class CheckQuiz {
	public static void main(String[]args) {
		
		// byte var1 = 200;
		// System.out.println(var1);
		// byte 허용범위 ~127 
		
		// char var2 = 'AB';
		// System.out.println(var2);
		// 하나의 문자리터럴을 작은따옴표 안에 저장할 수 있음
		
		char var3 = 65;
		System.out.println(var3);

		// long var4 = 500000000000;
		// System.out.println(var4);
		// long타입 정수리터럴 뒤에 l or L 입력
		// 수정 : long var4 = 500000000000L;
		
		// float var5 = 3.14;
		// System.out.println(var5);
		// 실수리터럴이 기본적으로 double이기에 float 타입으로 저장하기 위해 리터럴 뒤에 f or F를 입력
		// 수정 : float var5 = 3.14F;

		double var6 = 100.0;
		System.out.println(var6);

		// String var7 = "나의 직업은 "개발자"입니다.";
		// System.out.println(var7);
		// 문자열 내부에 큰따옴표를 사용하기 위해 이스케이프 문자를 입력
		// 수정 : String var7 = "나의 직업은 \"개발자\"입니다.";
		
		// boolean var8 = 0;
		// System.out.println(var8);
		// 논리 리터럴로 true와 false를 사용
		// boolean var8 = true;
		
		// int var9 = 1e2;
		// System.out.println(var9);
		// e가 포함된 숫자 리터럴은 실수 타입을 사용
		// double v2 = 1e2;

		float var10 = 1e2f;
		System.out.println(var10);
		
	}
}
