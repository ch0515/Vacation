import java.util.Scanner;
public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=0;
		String season = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("오늘은 몇 월 입니까?");
		month = scan.nextInt();
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			System.out.println("입력 오류");
		}
		System.out.println("지금은"+month+"월이고 현재 계절은"+season+"입니다.");
	}

}
