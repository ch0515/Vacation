import java.util.Scanner;
public class LogicalOperatorExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		boolean isDiscount = false;
		int age=0;
		System.out.print("당신의 나이를 입력하세요 : ");
		age = scan.nextInt();
		if(age<=19||age>=60) {
			isDiscount = true;
		}else {
			isDiscount = false;
		}
		System.out.println(isDiscount);
	}

}
