import java.util.Scanner;

public class Q1176 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[61];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < 61; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println("Fib(" + n + ") = " + arr[n]);
		}

	}

}
