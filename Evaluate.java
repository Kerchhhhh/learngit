import java.util.Scanner;

public class Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Please input your grade");
		int a=reader.nextInt();
		if(a<60) {
			System.out.println("fail");
		}
		else if(60<=a&&a<80) {
			System.out.println("pass");
		}
		else if(80<=a&&a<90) {
			System.out.println("good");
		}
		else if(90<=a&&a<100) {
			System.out.println("excellent good");
		}
	}

}
