
public class OperationExam {

	public static void main(String[] args) {


		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1); //-5
		System.out.println(i2); //-5 �÷����� ��ȣ�״��
		System.out.println(i3); // 5

		int i4 = ++i3; // i3 = i3+1 6;
		System.out.println(i4); //6
		System.out.println(i3); //6
		int i5 = i3++; //i3 = i3 +1;
		System.out.println(i5); // 6
		System.out.println(i3); // 7
		
		// i++�� ����� �ѵڿ� i�� ���� 1�ø��°�
		// ++i�� i�� ���� 1�ø��ڿ� ����� �ϴ°�

		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/(double)j);
		System.err.println(i%j);
		
		
	}

}
