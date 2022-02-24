package 클래스;

public class StaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 taxi = new Car2();
		Car2 suv = new Car2();
		
		taxi.wheelCount = 10;
		suv.wheelCount = 4;
		
		System.out.println("taxi의 바퀴수 "+taxi.wheelCount);
		System.out.println("suv의 바퀴수 "+suv.wheelCount);
	}

}
