package domein;

import java.util.Scanner;

public class oef04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double afstand,snelheid,min;
		double tijd,uren;
		
		do {
			System.out.println("geef de afstand in km (strikt positief): ");
			afstand = in.nextDouble();
		}while(!(afstand > 0));
		
		for(double i = 40; i <=140; i+=10) {
			tijd = afstand/i;
			uren = Math.floor(afstand/i);
			min = ((afstand/i)-uren)*60;

			System.out.printf("%3.0f km%10.0f km/u%8.0f u %2.0f min%n",afstand,i,uren,min);
		}
	}

}
