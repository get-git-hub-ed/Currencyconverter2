#Currencyconverter2
import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConvertejavascript:void(0)r {
 
	public static void main(String[] args) {
 
		double amount, dollar, pound, euro, yen, ruble, rupee, yuan;
		
		int a, b;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Hi, Welcome to the Currency Converter!!!\n");
 
		System.out.println("From which currency You want to Convert ?");
		
		System.out.println("1:Rupee \n2:Dollar \n3:Pound \n4:Euro \n5:Yen \n6:Ruble \n7:Yuan");
		a = sc.nextInt();
		
		System.out.println("\nTo which currency You want to Convert ? ");
		
		System.out.println("1:Rupee \n2:Dollar \n3:Pound \n4:Euro \n5:Yen \n6:Ruble \n7:Yuan");
		b = sc.nextInt();
		
		System.out.println("\nHow much Money you want to convert ?\n");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (a == 1) {
 
			if (b == 1) {
			rupee = amount;
			System.out.println("Your " + amount + " Rupee is : " + f.format(rupee) + " Rupees");
			}
			
			if (b == 2) {
			dollar = amount / 73.68;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
			}
 
			else if (b == 3) {
			pound = amount / 96.36;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
			}
 
			else if (b == 4) {
			euro = amount / 87.25;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
			}
 
			else if (b == 5) {
			yen = amount * 1.421;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
			}
 
			else if (b == 6) {
			ruble = amount * 1.0369;
			System.out.println("Your " + amount + " Rupee is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount * 0.0906;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
			
		} else if (a == 2) {
			// For Dollar Conversion
 
			if (b == 1) {
			rupee = amount * 73.68;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
			}
 
			if (b == 2) {
			dollar = amount;
			System.out.println("Your " + amount + " Dollar is : " + f.format(dollar) + " Dollar");
			}
			
			else if (b == 3) {
			pound = amount *0.76;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
			}
 
			else if (b == 4) {
			euro = amount * 1.31;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
			}
 
			else if (b == 5) {
			yen = amount * 104.59;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
			}
 
			else if (b == 6) {
			ruble = amount * 76.31;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount * 6.67;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
			
		} else if (a == 3) {
			// For Pound Conversion
 
			if (b == 1) {
			rupee = amount * 96.36 ;
			System.out.println("Your " + amount + " Pound is : " + f.format(rupee) + " Ruppes");
			}
 
			else if (b == 2) {
			dollar = amount * 1.31;
			System.out.println("Your " + amount + " Pound is : " + f.format(dollar) + " Dollar");
			}
 
			else if (b == 3) {
			pound = amount;
			System.out.println("Your " + amount + " Pound is : " + f.format(pound) + " Pound");
			}
			
			else if (b == 4) {
			euro = amount * 1.11;
			System.out.println("Your " + amount + " Pound is : " + f.format(euro) + " Euro");
			}
 
			else if (b == 5) {
			yen = amount * 136.99;
			System.out.println("Your " + amount + " Pound is : " + f.format(yen) + " Yen");
			}
 
			else if (b == 6) {
			ruble = amount * 100.02;
			System.out.println("Your " + amount + " Pound is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount * 8.73;
			System.out.println("Your " + amount + " Pound is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
			
		} else if (a == 4) {
			// For Euro Conversion
 
			if (b == 1) {
			rupee = amount * 87.24;
			System.out.println("Your " + amount + " Euro is : " + f.format(rupee) + " Ruppes");
			}
 
			else if (b == 2) {
			dollar = amount * 1.19;
			System.out.println("Your " + amount + " Euro is : " + f.format(dollar) + " Dollar");
			}
 
			else if (b == 3) {
			pound = amount * 0.90;
			System.out.println("Your " + amount + " Euro is : " + f.format(pound) + " Pound");
			}
 
			else if (b == 4) {
			euro = amount;
			System.out.println("Your " + amount + " Euro is : " + f.format(euro) + " Euro");
			}
			
			else if (b == 5) {
			yen = amount * 123.93;
			System.out.println("Your " + amount + " Euro is : " + f.format(yen) + " Yen");
			}
 
			else if (b == 6) {
			ruble = amount * 90.46;
			System.out.println("Your " + amount + " Euro is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount * 7.90;
			System.out.println("Your " + amount + " Euro is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
			
		} else if (a == 5) {
 
			// For Yen Conversion
 
			if (b == 1) {
			rupee = amount * 0.7038;
			System.out.println("Your " + amount + " Yen is : " + f.format(rupee) + " Ruppes");
			}
 
			else if (b == 2) {
			dollar = amount * 0.0096;
			System.out.println("Your " + amount + " Yen is : " + f.format(dollar) + " Dollar");
			}
 
			else if (b == 3) {
			pound = amount * 0.0073;
			System.out.println("Your " + amount + " Yen is : " + f.format(pound) + " Pound");
			}
 
			else if (b == 4) {
			euro = amount * 0.0081;
			System.out.println("Your " + amount + " Yen is : " + f.format(euro) + " Euro");
			}
 
			else if (b == 5) {
			yen = amount;
			System.out.println("Your " + amount + " Yen is : " + f.format(yen) + " Yen");
			}
			
			else if (b == 6) {
			ruble = amount * 0.73;
			System.out.println("Your " + amount + " Yen is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount * 0.064;
			System.out.println("Your " + amount + " Yen is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
			
		} else if (a == 6) {
			// For Ruble Conversion
 
			if (b == 1) {
			rupee = amount * 1.037;
			System.out.println("Your " + amount + " Ruble is : " + f.format(rupee) + " Ruppes");
			}
 
			if (b == 2) {
			dollar = amount * 0.0131;
			System.out.println("Your " + amount + " Ruble is : " + f.format(dollar) + " dollar");
			}
 
			else if (b == 3) {
			pound = amount * 0.01;
			System.out.println("Your " + amount + " Ruble is : " + f.format(pound) + " pound");
			}
 
			else if (b == 4) {
			euro = amount * 0.0111;
		    System.out.println("Your " + amount + " Ruble is : " + f.format(euro) + " euro");
			}
 
			else if (b == 5) {
			yen = amount * 1.3708;
			System.out.println("Your " + amount + " Ruble is : " + f.format(yen) + " yen");
			}
			
			else if (b == 6) {
			ruble = amount;
			System.out.println("Your " + amount + " Ruble is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount * 0.0874;
			System.out.println("Your " + amount + " Ruble is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
		    
		}   else if (a == 7) {
			// For Yuan Conversion
 
			if (b == 1) {
			rupee = amount * 16.8;
			System.out.println("Your " + amount + " Yuan is : " + f.format(rupee) + " Ruppes");
			}
 
			else if (b == 2) {
			dollar = amount * 0.239;
			System.out.println("Your " + amount + " Yuan is : " + f.format(dollar) + " dollar");
			}
 
			else if (b == 3) {
			pound = amount * 0.188;
			System.out.println("Your " + amount + " Yuan is : " + f.format(pound) + " pound");
			}
 
			else if (b == 4) {
			euro = amount * 0.209;
			System.out.println("Your " + amount + " Yuan is : " + f.format(euro) + " euro");
			}
 
			else if (b == 5) {
			yen = amount * 0.0637;
			System.out.println("Your " + amount + " Yuan is : " + f.format(yen) + " yen");
			}
			
			else if (b == 6) {
			ruble = amount * 0.0874;
			System.out.println("Your " + amount + " Yuan is : " + f.format(ruble) + " Ruble");
			}
			
			else if (b == 7) {
			yuan = amount;
			System.out.println("Your " + amount + " Yuan is : " + f.format(yuan) + " Yuan");
			}
			
			else {
			System.out.println("Invalid input");
		    }
		    
		}	
		
		else {
		    System.out.println("Invalid input");
		}
		
		System.out.println("\nThank you for choosing our Xie program");
	}
 
}
