package sec02.exam04_long;

public class FloatDoubleExample {

	public static void main(String[] args) {
	
		
		//실수값 저장
		double var1 = 3.14;
		float var2 = 3.14F;
		//정밀도검사
		double var4 = 0.1234567890123456789;
		float var5 =  0.1234567890123456789f;
		System.out.println(var4);
		System.out.println(var5);
		
		
		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
