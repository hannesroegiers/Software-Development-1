package domein;

import java.util.Scanner;

public class oef05 {

	public static void main(String[] args) {

		int getal,temp, grootste=0, tweede=0;
		Scanner in = new Scanner(System.in);
		
		for(int i = 1; i <= 10;i++) {
			System.out.printf("geef getal %d in: ",i);
			getal = in.nextInt();
			
			if(getal > grootste) {
				temp = grootste;
				grootste = getal;
				tweede = temp;
			}
			else if(getal < grootste && getal >tweede) {
				tweede = getal;
			}
		}
		System.out.printf("het op 1 na grootse getal = %d",tweede);
		
	}

}
