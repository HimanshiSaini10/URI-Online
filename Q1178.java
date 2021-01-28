import java.util.Scanner;

public class Q1178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double[] N = new double[100];
		
		for(int i = 0; i < 100; i++) {
			N[i] = t;
			t /= 2;
		}
		
		for(int i=0; i<100; i++) {
			System.out.format("%.4f", N[i]);
			System.out.println();
		}
	}

}
