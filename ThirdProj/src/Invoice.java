import java.text.NumberFormat;
import java.util.Scanner;
public class Invoice {

	public static void main(String[] args) {
		
	    String Price ,output;
		double Tax, GrandTotal,TaxRate,Sum;
	    Sum = 0;
      

		Scanner keyboard = new Scanner(System.in);
	
		System.out.print( "Tax Rate? " );
		TaxRate = keyboard.nextDouble();
		System.out.print( "Price? " );
		Price = keyboard.next();
		output = "\n"+ Price;
		
		while (!Price.equals("0.0")){
			
			double PriceAmount = Double.parseDouble(Price);
			Sum += PriceAmount;
			System.out.print( "Price? " );
			Price = keyboard.next();
			output = output + "\n"+Price;
			
		}
	
			
		Tax= Sum*TaxRate;
		GrandTotal = Sum + Tax;
		System.out.println("Receipt "+" "+ output);
		System.out.println("The tax is"+" "+ Tax);
		System.out.printf("The subtotal is %.2f%n" ,Sum);	      
		System.out.printf("Grand total is %.2f",GrandTotal ); 
		keyboard.close();
	}

}
