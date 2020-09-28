package domein;

import java.util.Scanner;

public class Oef02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int g1,g2,g3,som,gemiddelde,rest,grootste;
		
		System.out.print("geef het eerste getal in: ");
		g1 = in.nextInt();
		if(g1 > 0) {
			g1 -= 10;
			System.out.printf("het ingegeven getal was strikt positief en is verminderd met 10.%nHet heeft nu de waarde %d%n",g1);
		}
		else if(g1<0) {
			g1 += 10;
			System.out.printf("het ingegeven getal was strikt negatief en is vermeerderd met 10.%nHet heeft nu de waarde %d%n",g1);
		}
		else {
			g1 =1;
			System.out.println("het ingegeven getal was gelijk aan 0. het is vermeerder met 1%n");
		}
			
			
		
		System.out.print("geef het tweede getal in: ");
		g2 = in.nextInt();
		
		System.out.print("geef het derde getal in: ");
		g3 = in.nextInt();
		
		som = g1+g2+g3;
		gemiddelde = som/3;
		rest = som%3;
		
		if(g1 > g2 && g1>g3)
			grootste = g1;
		else if(g2 > g1 && g2 > g3)
			grootste = g2;
		else 
			grootste = g3;
		
		System.out.printf("van de ingevoerde getallen %d, %d en %d %nis de som %d%nhet gemiddelde %d%nde rest %d%nen het grootste getal %d"
				,g1,g2,g3,som,gemiddelde,rest,grootste);
		
		
	}

}			
