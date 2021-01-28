import java.util.Scanner;

public class Q1179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] par = new int[5];
		int[] impar = new int[5];
		
		int p = 0, ip = 0;
		
		int k = 0;
		
		while(k < 15) {
			int a = sc.nextInt();
			
			if((a&1) == 0) {
				// even number
				par[p] = a;
				p++;
				if(p == 5) {
					for(int i=0; i<5; i++)
						System.out.println("par[" + i + "] = " + par[i]);
					p = 0;
				}
			} else if((a&1) == 1) {
				//odd number
				impar[ip] = a;
				ip++;
				if(ip == 5) {
					for(int i=0; i<5; i++)
						System.out.println("impar[" + i + "] = " + impar[i]);
					ip = 0;
				}
			}
			k++;
		}
		if(ip != 0) {
			for(int i=0; i<ip; i++) {
				System.out.println("impar[" + i + "] = " + impar[i]);
			}
		}
		if(p != 0) {
			for(int i=0; i<p; i++) {
				System.out.println("par[" + i + "] = " + par[i]);
			}
		}
	}

}
