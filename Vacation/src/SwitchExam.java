import java.util.Scanner;
public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=0;
		String season = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� �� �Դϱ�?");
		month = scan.nextInt();
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default:
			System.out.println("�Է� ����");
		}
		System.out.println("������"+month+"���̰� ���� ������"+season+"�Դϴ�.");
	}

}
