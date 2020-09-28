package domein;

import java.util.Scanner;

public class oef03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean flag = true;
		int postcode;
		
		do {
		System.out.println("geef een postcode(4cijfers)");
		postcode = in.nextInt();
		
		switch(postcode) {
		
		case 9300:
			System.out.println("de postcode 9300 hoort bij de Aalst");
			flag = false;
			break;
		case 2000:
			System.out.println("de postcode 2000 hoort bij antwerpen");
			flag = false;
			break;
		case 1000:
			System.out.println("de postcode 1000 hoort bij brussel");
			flag = false;
			break;
		case 9200:
			System.out.println("postcode 9200 hoort bij Dendermonde");
			flag = false;
			break;
		case 9000:
			System.out.println("postcode 9000 hoort bij Gent");
			flag = false;
			break;
		case 8500:
			System.out.println("postcode 8500 hoort bij kortrijk");
			flag = false;
			break;
		case 9700:
			System.out.println("postcode 9700 hoort bij oudenaarde");
			flag = false;
			break;
		case 2300:
			System.out.println("postcode 2300 hoort bij turnhout");
			flag = false;
			break;
		default:
			System.out.println("er bestaat geen stad met deze postcode");
		}
			
		}while(flag);	

	}

}
