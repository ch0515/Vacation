package Ŭ����;

public class StringExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ȳ��ϼ���. ";
		String str2 = "���� ������� ���̳׿�. ������ ȭ����!!";
		
		String concatResult;
		String substringResult;
		
		concatResult = str1.concat(str2);
		substringResult = str1.substring(2);
		
		System.out.println(concatResult);
        System.out.println(substringResult);
	}

}
