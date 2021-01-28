import java.util.Scanner;

public class Q1174 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		for(int i=0; i<100; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<100; i++) {
			if(arr[i] <= 10) {
				System.out.println("A[" + i + "] = " + arr[i]);
			}
		}

	}

}
