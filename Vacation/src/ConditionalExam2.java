import java.util.Scanner;
public class ConditionalExam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.print("3�� ��� �Ǵ� 4�� ����� �Է��ϼ��� : ");
		a = scan.nextInt();
		if(a%3==0) {
			System.out.println("3�� ��� �Դϴ�.");
		}else if(a%4==0) {
			System.out.println("4�� ��� �Դϴ�.");
		}else {
			System.out.println("����");
		}
		
	}

}
