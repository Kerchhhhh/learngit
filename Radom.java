import java.util.Random;



public class Radom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=new Random().nextInt();
		int b=new Random().nextInt();
		int c=new Random().nextInt();
		int x[]= {a,b,c};
		int max=0,min=0;
		for(int i:x) {
			if(i<min) {
				min=i;
			}
			if(i>max) {
				max=i;
			}
		}
		System.out.println("a="+a+"\nb="+b+"\nc="+c);
		System.out.println("min="+min+"\nmax="+max);
	}
}
