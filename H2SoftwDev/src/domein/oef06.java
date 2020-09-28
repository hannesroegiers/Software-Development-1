package domein;

import java.util.Scanner;

public class oef06 {

	public static void main(String[] args) {
			int getal;
			Scanner in = new Scanner(System.in);
			
			
			System.out.print("geef een positief strikt geheel getal in: ");
			getal = in.nextInt();
			
			
			System.out.printf("De delers zijn: 1");
			for(int i = 2;i<=getal/2; i++) {
				if(getal%i == 0)
					System.out.printf("%4d",i);
			}
			System.out.printf(" en %d",getal);
	}

}
