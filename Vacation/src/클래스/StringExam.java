package Ŭ����;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello world");
		String str2 = new String("Hello world");
		
		if( str1.contentEquals(str2)) {
			System.out.println("str1�� str2�� ���� ���� ������ �ֽ��ϴ�.");
		}else {
			System.out.println("str1�� str2�� �ٸ� ���� ������ �ֽ��ϴ�.");
		}
		/*if( str1 == str2) {
			System.out.println("str1�� str2�� ���� �ν��Ͻ��� �����մϴ�.");
		}else {
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ��� �����մϴ�.");
		}*/
	}

}
