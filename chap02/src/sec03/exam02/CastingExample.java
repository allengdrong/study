package sec03.exam02;
	public class CastingExample {
		public static void main(String[]args) {
			int intValue = 44032;
			char charValue = (char) intValue;
			System.out.println(charValue);
			// 가의 유니코드 : 44032
			
			long longValue = 500;
			intValue = (int) longValue;
			System.out.println(intValue);
			
			double doubleValue = 3.14;
			intValue = (int) doubleValue;
			System.out.println(intValue);
			
		}
	}