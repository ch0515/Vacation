import java.util.Scanner;
public class TernaryExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hour = 0;
		String ampm;
		System.out.print("���� �ø� �Է��ϼ��� : ");
		hour = scan.nextInt();
		ampm = hour<12 ? "����" : "����";
		System.out.println(ampm);
	}

}
