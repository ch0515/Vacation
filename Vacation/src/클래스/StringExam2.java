package 클래스;

public class StringExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕하세요. ";
		String str2 = "벌써 여기까지 오셨네요. 끝까지 화이팅!!";
		
		String concatResult;
		String substringResult;
		
		concatResult = str1.concat(str2);
		substringResult = str1.substring(2);
		
		System.out.println(concatResult);
        System.out.println(substringResult);
	}

}
