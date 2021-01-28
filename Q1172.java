import java.util.Scanner;

public class Q1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for(int i=0; i<10; i++) {
            int a = sc.nextInt();
            if(a < 0) a = 1;
            X[i] = a;
        }
        for(int i=0; i<10; i++) {
        	System.out.println("X[" + i + "] = " + X[i]);
        }
	}

}
