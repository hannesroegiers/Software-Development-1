package domein;

import java.util.Scanner;

public class oef09 {

	public static void main(String[] args) {

		int getal, counter=0;
		Scanner in = new Scanner(System.in);
		System.out.print("geef een strikt positief geheel getal in: ");
		getal = in.nextInt();
		
		do {
			if(getal % 2 == 0) {
				getal = getal/2;
				counter++;
			}
			else {
				getal = (getal*3)+1;
				counter++;
			}
		}while(getal != 1);
	
		System.out.printf("het getal wijzigt %d voor het = aan 1 was",counter);
	}

}
