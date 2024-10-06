import java.util.*;

class icalcnumberconverter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		char homepage = 'Y';

		while (homepage == 'Y' || homepage == 'y') {
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

			System.out.println(
					"\t\t\t\t  _   _                 _                  _____                          _            ");
			System.out.println(
					"\t\t\t\t| \\ | |               | |                / ____|                        | |           ");
			System.out.println(
					"\t\t\t\t|  \\| |_   _ _ __ ___ | |__   ___ _ __  | |     ___  _ ____   _____ _ __| |_ ___ _ __ ");
			System.out.println(
					"\t\t\t\t| . ` | | | | '_ ` _ \\| '_ \\ / _ \\ '__| | |    / _ \\| '_ \\ \\ / / _ \\ '__| __/ _ \\ '__|");
			System.out.println(
					"\t\t\t\t| |\\  | |_| | | | | | | |_) |  __/ |    | |___| (_) | | | \\ V /  __/ |  | ||  __/ |   ");
			System.out.println(
					"\t\t\t\t|_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|     \\_____\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|   ");

			System.out.println(
					"\t\t\t\t======================================================================================");

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

			switch (option) {

				case 1:

					char decconverter = 'Y';

					System.out.print("\f");
					while (decconverter == 'Y' || decconverter == 'y') {
						// System.out.print("\033[H\033[2J");
						// System.out.flush();

						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
						System.out.println("\t\t\t\t\t\t\t|\t\t Decimal Converter \t\t|");
						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");

						System.out.println();
						System.out.println();

						System.out.print("\t\t\t\t\t\t\tEnter An Decimal Number: ");
						int dc = input.nextInt();

						System.out.println();

						if (dc > 0) {

							int decimalby = dc;
							String binary = "";

							while (decimalby != 0) {
								int remainder = decimalby % 2;
								binary = remainder + binary;

								decimalby /= 2;

							}
							System.out.println("\t\t\t\t\t\t\tBinary Number: " + binary);

							int decimaloc = dc;
							String octal = "";
							while (decimaloc != 0) {
								int remainder = decimaloc % 8;
								octal = remainder + octal;

								decimaloc /= 8;

							}
							System.out.println("\t\t\t\t\t\t\tOctal Number: " + octal);

							int decimalhex = dc;
							String hexa = "";
							while (decimalhex != 0) {
								int remainder = decimalhex % 16;
								if (remainder < 10) {
									hexa = remainder + hexa;
								} else {
									char ch = (char) ('A' + (remainder - 10));
									hexa = ch + hexa;

								}

								decimalhex /= 16;

							}
							System.out.println("\t\t\t\t\t\t\tHexa Number: " + hexa);

							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
							homepage = input.next().charAt(0);

							if (homepage == 'Y' || homepage == 'y') {
								decconverter = 'N';
							} else {
								homepage = 'N';
								decconverter = 'N';
							}

						} else {
							System.out.println("\t\t\t\t\t\t\t\tInvalid Input...");
							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to input number again (Y/N) -> ");
							decconverter = input.next().charAt(0);

							if (decconverter == 'Y' || decconverter == 'y') {

							} else {
								return;

							}

						}

					}
					break;
				case 2:

					char binaryconverter = 'Y';
					while (binaryconverter == 'Y') {
						// System.out.print("\033[H\033[2J");
						// System.out.flush();

						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
						System.out.println("\t\t\t\t\t\t\t|\t\t Binary Converter \t\t|");
						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");

						System.out.println();
						System.out.println();

						// BINARY CONVERTION

						System.out.print("\t\t\t\t\t\t\tEnter An Binary Number: ");
						int dc = input.nextInt();

						System.out.println();

						boolean validity = true;

						// number checking if 0 or 1...
						int temp = dc;
						while (temp != 0) {

							int remainder = temp % 10;
							temp /= 10;
							if (remainder != 1 && remainder != 0) {
								validity = false;

							}

						}

						if (validity == true) {

							int binarydecimal = dc;
							int decimal = 0;
							int power = 1;

							while (binarydecimal != 0) {
								int remainder = binarydecimal % 10;

								decimal = decimal + remainder * power;
								power *= 2;

								binarydecimal /= 10;

							}
							System.out.println("\t\t\t\t\t\t\tDecimal Number: " + decimal);

							int decimaloc = decimal;
							String octal = "";
							while (decimaloc != 0) {
								int remainder = decimaloc % 8;
								octal = remainder + octal;

								decimaloc /= 8;

							}
							System.out.println("\t\t\t\t\t\t\tOctal Number: " + octal);

							int decimalhex = decimal;
							String hexa = "";
							while (decimalhex != 0) {
								int remainder = decimalhex % 16;
								if (remainder < 10) {
									hexa = remainder + hexa;
								} else {
									char ch = (char) ('A' + (remainder - 10));
									hexa = ch + hexa;

								}

								decimalhex /= 16;

							}
							System.out.println("\t\t\t\t\t\t\tHexa Number: " + hexa);

							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
							homepage = input.next().charAt(0);

							if (homepage == 'Y' || homepage == 'y') {
								binaryconverter = 'N';

							} else {
								return;
							}

						} else {
							System.out.println("\t\t\t\t\t\t\t\tInvalid Input...");
							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to input number again (Y/N) -> ");
							binaryconverter = input.next().charAt(0);

							if (binaryconverter == 'Y' || binaryconverter == 'y') {

							} else {
								return;
							}
						}

					}
					break;
				case 3:
					char octalconverter = 'Y';
					while (octalconverter == 'Y') {
						// System.out.print("\033[H\033[2J");
						// System.out.flush();

						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
						System.out.println("\t\t\t\t\t\t\t|\t\t Octal Converter \t\t|");
						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");

						System.out.println();
						System.out.println();

						// Octal CONVERTION

						System.out.print("\t\t\t\t\t\t\tEnter An Octal Number: ");
						int dc = input.nextInt();

						System.out.println();

						boolean validity = true;

						// number checking...
						int temp = dc;
						while (temp != 0) {

							int remainder = temp % 10;
							temp /= 10;
							if (!(remainder >= 0 && remainder <= 7)) {
								validity = false;

							}

						}

						if (validity == true) {

							int octaldecimal = dc;
							int decimal = 0;
							int power = 1;

							while (octaldecimal != 0) {
								int remainder = octaldecimal % 10;

								decimal = decimal + remainder * power;
								power *= 8;

								octaldecimal /= 10;

							}
							System.out.println("\t\t\t\t\t\t\tDecimal Number: " + decimal);

							int decimalby = decimal;
							String binary = "";

							while (decimalby != 0) {
								int remainder = decimalby % 2;
								binary = remainder + binary;

								decimalby /= 2;

							}
							System.out.println("\t\t\t\t\t\t\tBinary Number: " + binary);

							int decimalhex = decimal;
							String hexa = "";
							while (decimalhex != 0) {
								int remainder = decimalhex % 16;
								if (remainder < 10) {
									hexa = remainder + hexa;
								} else {
									char ch = (char) ('A' + (remainder - 10));
									hexa = ch + hexa;

								}

								decimalhex /= 16;

							}
							System.out.println("\t\t\t\t\t\t\tHexa Number: " + hexa);

							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
							homepage = input.next().charAt(0);

							if (homepage == 'Y' || homepage == 'y') {
								octalconverter = 'N';

							} else {
								return;
							}

						} else {
							System.out.println("\t\t\t\t\t\t\t\tInvalid Input...");
							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to input number again (Y/N) -> ");
							octalconverter = input.next().charAt(0);

							if (octalconverter == 'Y' || octalconverter == 'y') {

							} else {
								return;
							}
						}

					}
					break;
				case 4:
					char hexconverter = 'Y';
					while (hexconverter == 'Y') {
						// System.out.print("\033[H\033[2J");
						// System.out.flush();

						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
						System.out.println("\t\t\t\t\t\t\t|\t\t Hexadecimal Converter \t\t|");
						System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");

						System.out.println();
						System.out.println();

						// hexadecimal CONVERTION

						input.nextLine();
						System.out.print("\t\t\t\t\t\t\tEnter An Hexadecimal Number: ");
						String dc = input.nextLine();

						System.out.println();

						boolean validity = true;

						// number checking...
						int pow = 1;
						int decimal = 0;
						for (int i = dc.length() - 1; i >= 0; i--) {
							char base = dc.charAt(i);
							int digit = 0;
							if (base >= '0' && base <= '9') {
								digit = base - '0';
							} else if (base >= 'A' && base <= 'F') {
								digit = 10 + base - 'A';
							} else if (base >= 'a' && base <= 'f') {
								digit = 10 + base - 'a';
							} else {
								validity = false;
							}
							decimal += digit * pow;
							pow *= 16;
						}

						if (validity == true) {
							System.out.println("\t\t\t\t\t\t\tDecimal Number: " + decimal);

							int decimalby = decimal;
							String binary = "";

							while (decimalby != 0) {
								int remainder = decimalby % 2;
								binary = remainder + binary;

								decimalby /= 2;

							}
							System.out.println("\t\t\t\t\t\t\tBinary Number: " + binary);

							int decimaloc = decimal;
							String octal = "";
							while (decimaloc != 0) {
								int remainder = decimaloc % 8;
								octal = remainder + octal;

								decimaloc /= 8;

							}
							System.out.println("\t\t\t\t\t\t\tOctal Number: " + octal);

							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
							homepage = input.next().charAt(0);

							if (homepage == 'Y' || homepage == 'y') {
								hexconverter = 'N';

							} else {
								return;
							}

						} else {
							System.out.println("\t\t\t\t\t\t\t\tInvalid Input...");
							System.out.println();

							System.out.print("\t\t\t\t\t\t\t\tDo you want to input number again (Y/N) -> ");
							hexconverter = input.next().charAt(0);

							if (hexconverter == 'Y' || hexconverter == 'y') {

							} else {
								return;
							}
						}

					}
					break;
					
		
		
	case 5:		
	char romannumber='Y';
			while (romannumber=='Y'){
				//System.out.print("\033[H\033[2J");  
				//System.out.flush();
		
			System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
			System.out.println("\t\t\t\t\t\t\t|\t\t Roman Number Converter \t|");
			System.out.println("\t\t\t\t\t\t\t+-----------------------------------------------+");
			
			System.out.println();
			System.out.println();
			
			// hexadecimal CONVERTION =============================================================================
			
			System.out.println("\t\t\t\t\t\t\t[01] Decimal Number to Roman Number Converter");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t[02] Roman Number to Decimal Number Converter");

			System.out.print("\t\t\t\tEnter an Option -> ");
			int optionroman = input.nextInt();
			System.out.println();
			
			switch(optionroman){
				case 1:
				System.out.print("\033[H\033[2J");
				System.out.flush();
				
				System.out.println("\t\t\t\t\t\t\t+---------------------------------------------------------+");
				System.out.println("\t\t\t\t\t\t\t|\t\t Decimal Number to Roman Number Converter |");
				System.out.println("\t\t\t\t\t\t\t+---------------------------------------------------------+");
				
				input.nextLine();
				System.out.print("\t\t\t\t\t\t\tEnter a Decimal Number : ");
				String num = input.nextLine();
				
				boolean validity = true;
				
				if (num.isEmpty()) {
						validity = false;
				} else {
					for (int i = 0; i < num.length(); i++) {
						char base = num.charAt(i);
						if (base < '0' || base > '9') {
							validity = false;
							break;
						}
					}
				}
				if (validity) {
					int number = Integer.parseInt(num);
					String romanNumber = "";

					while (number >= 1000) {
						romanNumber += "M";
						number -= 1000;
					}
					while (number >= 900) {
						romanNumber += "CM";
						number -= 900;
					}
					while (number >= 500) {
						romanNumber += "D";
						number -= 500;
					}
					while (number >= 400) {
						romanNumber += "CD";
						number -= 400;
					}
					while (number >= 100) {
						romanNumber += "C";
						number -= 100;
					}
					while (number >= 90) {
						romanNumber += "XC";
						number -= 90;
					}
					while (number >= 50) {
						romanNumber += "L";
						number -= 50;
					}
					while (number >= 40) {
						romanNumber += "XL";
						number -= 40;
					}
					while (number >= 10) {
						romanNumber += "X";
						number -= 10;
					}
					while (number >= 9) {
						romanNumber += "IX";
						number -= 9;
					}
					while (number >= 5) {
						romanNumber += "V";
						number -= 5;
					}
					while (number >= 4) {
						romanNumber += "IV";
						number -= 4;
					}
					while (number >= 1) {
						romanNumber += "I";
						number -= 1;
					}
					
					System.out.println("\t\t\t\t\t\t\tRoman numeral : " + romanNumber);
					System.out.println();

					System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
					homepage = input.next().charAt(0);
					
					if (homepage =='Y' || homepage =='y') {
						romannumber = 'N';
					} else {
						return;
					}
				} else {
					System.out.print("\t\t\t\t\t\t\t\tInvalid Input");
					System.out.println();
					System.out.print("\t\t\t\t\t\t\t\tDo you want to go previous menu (Y/N) -> ");
					romannumber = input.next().charAt(0);
							
					if (romannumber=='Y' || romannumber=='y') {
						romannumber = 'Y';
					} else {
						return;
					}
				}
				break;	
				
				case 2:

					//System.out.print("\033[H\033[2J");  
					//System.out.flush();

				System.out.println("\t\t\t\t\t\t\t+---------------------------------------------------------+");
				System.out.println("\t\t\t\t\t\t\t|\t\t Roman Number to Decimal Number Converter |");
				System.out.println("\t\t\t\t\t\t\t+---------------------------------------------------------+");

					input.nextLine();
					System.out.print("\t\t\t\t\t\t\t\tEnter a Roman Number : ");
					String inNum = input.nextLine();

					validity = true;

					for (int i = 0; i < inNum.length(); i++) {
						char base = inNum.charAt(i);
						if (base != 'I' && base != 'V' && base != 'X' &&
							base != 'L' && base != 'C' && base != 'D' &&
							base != 'M') {
							validity = false;
							break;
						}
					}
		
					if (validity == true){
					
						int res = 0;
						int n = inNum.length();
		
						for (int i = 0; i < n; i++) {
							int s1 = 0;
							switch (inNum.charAt(i)) {
								case 'I': s1 = 1; break;
								case 'V': s1 = 5; break;
								case 'X': s1 = 10; break;
								case 'L': s1 = 50; break;
								case 'C': s1 = 100; break;
								case 'D': s1 = 500; break;
								case 'M': s1 = 1000; break;
							}
								
							int s2 = 0;
							if (i + 1 < n) {
								switch (inNum.charAt(i + 1)) {
									case 'I': s2 = 1; break;
									case 'V': s2 = 5; break;
									case 'X': s2 = 10; break;
									case 'L': s2 = 50; break;
									case 'C': s2 = 100; break;
									case 'D': s2 = 500; break;
									case 'M': s2 = 1000; break;
								}
							}
						
							if (s1 >= s2) {
								res = res + s1;
							} else {
								res = res + s2 - s1;
								i++;
							}
						}
						System.out.println("\t\t\t\t\t\t\t\tDecimal number : " + res);
						System.out.println();
						System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
						homepage = input.next().charAt(0);
		
						if (homepage =='Y' || homepage =='y'){
							romannumber = 'N';
						}else{
							return;
						}
					} else {
						System.out.print("\t\t\t\t\t\t\t\tInvalid Input");
						System.out.println();
						System.out.print("\t\t\t\t\t\t\t\tDo you want to go previous menu (Y/N) -> ");
						romannumber = input.next().charAt(0);
								
						if (romannumber=='Y' || romannumber=='y'){
							romannumber='Y';
						}else{
							return;
						}
					}
					break;
			
				default:
					System.out.println("\t\t\t\t\t\t\t\tInput valid option");
					System.out.println();
					break;
			}				
		}
		break;

		default:
			System.out.println("\t\t\t\t\t\t\t\tInput valid option selected");
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t\tDo you want to go to home page (Y/N) -> ");
						homepage = input.next().charAt(0);
		
						if (homepage =='Y' || homepage =='y'){
							romannumber = 'N';
						}else{
							return;
						}
		break;
				
			}

			}
		}

	}

