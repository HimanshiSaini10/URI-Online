import java.util.Scanner;

public class Q1173 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = n;
			n <<= 1;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
