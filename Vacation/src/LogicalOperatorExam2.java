import java.util.Scanner;
public class LogicalOperatorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age = 0;
		boolean isTwenties = false;
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();
		if( age >= 20 && age <= 29) {
			isTwenties = true;
		}else {
			isTwenties = false;
		}
		System.out.println(isTwenties);
	}

}
