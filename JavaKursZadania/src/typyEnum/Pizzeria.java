package typyEnum;

import java.util.Scanner;

public class Pizzeria {
	
	public static void main(String[] args) {
		System.out.println("Dostêpne pizze: ");
		for (Pizza p: Pizza.values()){
			System.out.println(p);
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Jak¹ pizze wybierasz? ");
		Pizza pizza = Pizza.valueOf(input.nextLine());
		
		System.out.println("Dziekujemy za zamówienie pizzy " + pizza.name());
		input.close();
		
		
	}
	
	

}



