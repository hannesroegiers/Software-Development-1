package domein;

import java.util.Scanner;

public class oef07 {
	public static void main(String[] args) {
		
		int getal,x2=0,x3=0,x6=0;
		Scanner in = new Scanner(System.in);
		
		 do{
			System.out.println("geef mij keer een getal aub:");
			getal = in.nextInt();
			if(getal > 0) {
				if(getal%6 == 0) {
					x2++;
					x3++;
					x6++;
				}else if(getal%3 == 0) {
					x3++;
				}
				else if(getal%2 == 0) {
					x2++;
					  }
			}
		}while(getal != 0);
		
		System.out.printf("Er %s %d %s deelbaar door 2%n",(x2>1) ? "zijn" : "is",x2,(x2>1) ? "getallen" : "getal");
		System.out.printf("Er %s %d %s deelbaar door 3%n",(x3>1) ? "zijn" : "is",x3,(x3>1) ? "getallen" : "getal");
		System.out.printf("Er %s %d %s deelbaar door 6%n",(x6>1) ? "zijn" : "is",x6,(x6>1) ? "getallen" : "getal");
	}
}
