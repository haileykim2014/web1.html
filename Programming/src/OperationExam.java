
public class OperationExam {

	public static void main(String[] args) {


		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1); //-5
		System.out.println(i2); //-5 플러스는 부호그대로
		System.out.println(i3); // 5

		int i4 = ++i3; // i3 = i3+1 6;
		System.out.println(i4); //6
		System.out.println(i3); //6
		int i5 = i3++; //i3 = i3 +1;
		System.out.println(i5); // 6
		System.out.println(i3); // 7
		
		// i++는 출력을 한뒤에 i의 값을 1올리는것
		// ++i는 i의 값을 1올린뒤에 출력을 하는것

		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/(double)j);
		System.err.println(i%j);
		
		
	}

}
