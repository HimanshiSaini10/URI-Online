import java.util.Scanner;

public class Q1175 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		
		for(int i=0; i<20; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0,j=19; i<j; i++,j--) {
			arr[i] = arr[i]^arr[j];
			arr[j] = arr[i]^arr[j];
			arr[i] = arr[i]^arr[j];
		}
		
		for(int i=0; i<20; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
