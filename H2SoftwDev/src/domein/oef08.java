package domein;

import java.util.Scanner;

public class oef08 {

	public static void main(String[] args) {

		int getal, deler,counter = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("geef een strikt positieve deler in: ");
			deler = in.nextInt();
		}while(deler <= 0);
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("geef getal %d in(of stop met -1): ",i);
			getal = in.nextInt();
			
			if(getal % deler == 0)
				counter++;
			else if(getal == -1)
				break;
		}
		System.out.printf("er zijn %d getallen deelbaar door %d",counter,deler);
				
		
	}

}
