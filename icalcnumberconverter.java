import java.util.*;
class icalcnumberconverter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		char homepage='Y';
		
		while(homepage=='Y' || homepage=='y'){
			System.out.print("\033[H\033[2J");  
			System.out.flush();
				
		System.out.println("\t\t\t\t\t\t\t __   ______             __           ");
		System.out.println("\t\t\t\t\t\t\t|  \\ /      \\           |  \\          ");
		System.out.println("\t\t\t\t\t\t\t\\$$|  $$$$$$\\  ______  | $$  _______ ");
		System.out.println("\t\t\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");
		System.out.println("\t\t\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
		System.out.println("\t\t\t\t\t\t\t| $$| $$   __  /      $$| $$| $$      ");
		System.out.println("\t\t\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____ ");
		System.out.println("\t\t\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
		System.out.println("\t\t\t\t\t\t\t\\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");
		
		System.out.println();
				
		System.out.println("\t\t\t\t  _   _                 _                  _____                          _            ");
		System.out.println("\t\t\t\t| \\ | |               | |                / ____|                        | |           ");
		System.out.println("\t\t\t\t|  \\| |_   _ _ __ ___ | |__   ___ _ __  | |     ___  _ ____   _____ _ __| |_ ___ _ __ ");
		System.out.println("\t\t\t\t| . ` | | | | '_ ` _ \\| '_ \\ / _ \\ '__| | |    / _ \\| '_ \\ \\ / / _ \\ '__| __/ _ \\ '__|");
		System.out.println("\t\t\t\t| |\\  | |_| | | | | | | |_) |  __/ |    | |___| (_) | | | \\ V /  __/ |  | ||  __/ |   ");
		System.out.println("\t\t\t\t|_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|     \\_____\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|   ");
		
		System.out.println("\t\t\t\t======================================================================================");
                                                                                       
        System.out.println();                                 
		System.out.println();
		
		System.out.println("\t\t\t\t\t[01] Decimal Converter");
		System.out.println(); 
	
		System.out.println("\t\t\t\t\t[02] Binary Converter");
		System.out.println(); 
				
		System.out.println("\t\t\t\t\t[03] Octal Converter");
		System.out.println(); 
				
		System.out.println("\t\t\t\t\t[04] Hexadecimal Converter");
		System.out.println(); 
				
		System.out.println("\t\t\t\t\t[05] Roman Number Converter");
		System.out.println(); 
				
		System.out.print("\t\t\t\tEnter An Option -> "); 
		int option = input.nextInt();
	
		System.out.println();
		System.out.println();
		
		switch (option){
			
			case 1:
			
			char decconverter='Y';
			
			System.out.print("\f");
			while (decconverter=='Y' || decconverter=='y'){
				//System.out.print("\033[H\033[2J");  
				//System.out.flush();
		
			System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
			System.out.println("\t\t\t\t\t\t\t|\t\t Decimal Converter \t\t|");
			System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
			
			System.out.println();
			System.out.println();
			
			System.out.print("\t\t\t\t\t\t\tEnter An Decimal Number: ");
			int dc = input.nextInt();
			
			System.out.println();
			
			if(dc>0){
							
				int decimalby = dc;			
				String binary="";
				
				while(decimalby!=0){
						int remainder = decimalby%2;
						binary = remainder + binary;
						
						decimalby/=2;
													
				}
				System.out.println("\t\t\t\t\t\t\tBinary Number: "+binary);
								
				int decimaloc = dc;
				String octal="";
				while(decimaloc!=0){
					int remainder = decimaloc%8;
					octal = remainder + octal;
					
					decimaloc/=8;
					
				}
				System.out.println("\t\t\t\t\t\t\tOctal Number: "+octal);
							
				int decimalhex = dc;
				String hexa="";
				while (decimalhex!=0){
						int remainder = decimalhex%16;
						if (remainder<10){
							hexa = remainder + hexa;
						} else {
							char ch = (char) ('A' + (remainder-10));
							hexa = ch + hexa;
							
						}
									
						decimalhex/=16;
					
				}
				System.out.println("\t\t\t\t\t\t\tHexa Number: "+hexa);
				
				System.out.println();
								
				System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
				homepage = input.next().charAt(0);
				
				if (homepage=='Y' || homepage=='y'){
					decconverter = 'N';
				} else {
					homepage='N';
					decconverter='N';
				}
				
			}else {
					System.out.println("\t\t\t\t\t\t\t\tInvalid Input...");
					System.out.println();
					
					System.out.print("\t\t\t\t\t\t\t\tDo you want to input number again (Y/N) -> ");
					decconverter = input.next().charAt(0);
					
					if(decconverter=='Y' ||  decconverter=='y'){
						
						
					} else {
						return;
						
					}
				
				
					}	
			
				}	
			break;				
					
		}
	} 
	  
	}
}
