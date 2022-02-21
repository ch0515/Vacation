import java.util.Scanner;
public class ConditionalExam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.print("3의 배수 또는 4의 배수를 입력하세요 : ");
		a = scan.nextInt();
		if(a%3==0) {
			System.out.println("3의 배수 입니다.");
		}else if(a%4==0) {
			System.out.println("4의 배수 입니다.");
		}else {
			System.out.println("오류");
		}
		
	}

}
