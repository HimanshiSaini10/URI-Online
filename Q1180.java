import java.util.Scanner;

public class Q1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = 0, min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a < min) {
				pos = i;
				min = a;
			}
		}
		System.out.println("Min value: " + min);
		System.out.println("Position: " + pos);
	}

}
