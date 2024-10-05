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

			}
		}

	}
}
