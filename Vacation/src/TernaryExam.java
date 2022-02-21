import java.util.Scanner;
public class TernaryExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hour = 0;
		String ampm;
		System.out.print("현재 시를 입력하세요 : ");
		hour = scan.nextInt();
		ampm = hour<12 ? "오전" : "오후";
		System.out.println(ampm);
	}

}
