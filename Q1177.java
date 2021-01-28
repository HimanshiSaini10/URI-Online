import java.util.Scanner;

public class Q1177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] N = new int[1000];
		
		int num = 0;
		
		for(int i=0; i<1000; i++) {
			if(num == t) num = 0;
			N[i] = num;
			num++;
		}
		
		for(int i=0; i<1000; i++) {
			System.out.println(N[i]);
		}
		
	}

}
